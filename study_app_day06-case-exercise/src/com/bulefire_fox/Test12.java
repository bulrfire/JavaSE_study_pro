package com.bulefire_fox;

import java.util.Random;
import java.util.Scanner;

/**
    需求：双色球模拟
 */
public class Test12 {
    public static void main(String[] args) {
        // 1、随机6个红球号码（1-33，不能重复），随机一个蓝球号码（1-16），可以采用数组装起来作为中奖号码
        int[] luckNumbers = createLuckNumber();
        //printArray(luckNumbers);

        // 2、录入用户选中的号码
        int[] userNumbers = userInputNumbers();
        //printArray(userNumbers);

        // 3、判断中奖情况
        judge(luckNumbers, userNumbers);

    }

    public static void judge(int[] luckNumbers, int[] userNumbers ){
        // 判断是否中奖了。
        // luckNumbers = [12, 23, 8, 16, 15, 32,   9]
        // userNumbers = [23, 13, 18, 6, 8, 33,   10]
        // 1、定义2个变量分别存储红球命中的个数，以及蓝球命中的个数。
        int redHitNumbers = 0;
        int blueHitNumbers = 0;

        // 2、判断红球命中了几个，开始统计
        for (int i = 0; i < userNumbers.length - 1; i++) {
            //找有没有相同的
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                // 每次找到了相等了，意味着当前号码命中了
                if(userNumbers[i] == luckNumbers[j]){
                    redHitNumbers ++ ;
                    break;
                }
            }
        }

        // 蓝球号码是否命中了
        blueHitNumbers = luckNumbers[luckNumbers.length - 1] == userNumbers[userNumbers.length - 1] ? 1 : 0;

        System.out.println("您投注号码是："  );
        printArray(userNumbers);
        System.out.println("中奖号码是："  );
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printArray(luckNumbers);
        System.out.println("您命中了 " + redHitNumbers + " 个红球");
        System.out.println("您 " + ( blueHitNumbers == 1 ? "命中": "没有命中" ) + " 了蓝球");

        // 判断中奖情况了
        if(blueHitNumbers == 1 && redHitNumbers < 3){
            System.out.println("恭喜您，中了5元小奖！");
        }
        else if(blueHitNumbers == 1 && redHitNumbers == 3 || blueHitNumbers == 0 && redHitNumbers == 4){
            System.out.println("恭喜您，中了10元小奖！");
        }
        else if(blueHitNumbers == 1 && redHitNumbers == 4 || blueHitNumbers == 0 && redHitNumbers == 5){
            System.out.println("恭喜您，中了200元！");
        }
        else if(blueHitNumbers == 1 && redHitNumbers == 5){
            System.out.println("恭喜您，中了3000元大奖！");
        }
        else if(blueHitNumbers == 0 && redHitNumbers == 6){
            System.out.println("恭喜您，中了500万超级大奖！");
        }
        else if(blueHitNumbers == 1 && redHitNumbers == 6){
            System.out.println("恭喜您，中了1000万巨奖！可以开始享受人生，诗和远方！！");
        }
        else {
            System.out.println("感谢您为福利事业做出的突出贡献！！");
        }
    }

    public static int[] userInputNumbers(){
        // a、动态初始化一个数组，长度为7
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        //投注红球号码
        for (int i = 0; i < numbers.length - 1; i++) {
            int data = 0;
            while (true) {
                System.out.println("请您输入第"+(i + 1)+"个红球号码（1-33、不重复）：");
                data = sc.nextInt();

                //判断是否在1-33
                if (data < 1 || data > 33){
                    System.out.println("对不起，号码不在范围内");

                }
                else{
                    //号码合法，继续判断是否重复
                    if(exist(numbers,data)){
                        //data重复
                        System.out.println("对不起，当前红球号码重复");
                    }
                    else{
                        //data合法，可以使用
                        numbers[i] = data;
                        break;//结束死循环
                    }
                }
            }
        }

        // b、录入一个蓝球号码
        int data = 0;
        while (true) {
            System.out.println("请您输入一个蓝球号码（1-16）：");
            data = sc.nextInt();

            if (data < 1 || data > 16){
                System.out.println("对不起，当前蓝球号码不在范围内");
            }
            else{
                numbers[numbers.length - 1] = data;
                break;//蓝球录入成功，退出死循环
            }
        }
        return numbers;
    }

    private static boolean exist(int[] numbers, int data) {
        //判断data是否在numbers中存在
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                break;
            }
            if (numbers[i] == data){
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] arr){
        System.out.print ("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static int[] createLuckNumber(){
        // a、定义一个动态初始化的数组，存储7个数字
        int[] numbers = new int[7];  // [12, 23, 0, 0, 0, 0, | 0]
        //                                   i
        // b、遍历数组，为每个位置生成对应的号码。(注意：遍历前6个位置，生成6个不重复的红球号码，范围是1-33)
        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            // 为当前位置找出一个不重复的1-33之间的数字
            while (true) {
                int data = r.nextInt(33) + 1; // 1-33 ====>  (0-32) + 1

                // c、注意：必须判断当前随机的这个号码之前是否出现过，出现过要重新随机一个，直到不重复为止，才可以存入数组中去。
                if (!exist(numbers,data)) {
                    //不重复
                    numbers[i] = data;
                    break;//结束死循环
                }
            }
        }
        // d、为第7个位置生成一个1-16的号码作为蓝球号码
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }
}
