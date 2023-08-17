package com.buefire_fox.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        //目标：掌握使用For循环批量产生数据。
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(i);
        }

        System.out.println("-------------------------------------------------------");

        //2.定义一个变量用于求和
        int sum = 0;

        //1.定义一个循环，先产生1~100这100个数。
        for (int i = 1; i <= 100 ; i++) {
            // i = 1 2 3 4 5
            sum += i;//sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("--------------------------------------------------------");

        //2.定义一个变量用于求和
        int sum1 = 0;

        //1.定义一个循环产生1-100之间的奇数
        for (int i = 1; i < 100 ; i += 2) {
            // i = 1 3 5 ...
            sum1 += i;
        }
        System.out.println(sum1);

        System.out.println("------------------------------------------------------");

        //3.定义一个变量用于累加奇数求和
        int sum2 = 0;

        // 1. 定义一个循环产生1-100之间的每一个数
        for (int i = 1; i <= 100; i++) {
            // i = 1 2 3 4 ... 99 100
            //2.使用一个if分支判断i是否是奇数，如果是，才累加给一个变量
            if (i % 2 == 1){
                // i = 1 3 5 7 9 ...
                sum2 += i;
            }
        }
        System.out.println(sum2);
    }
}
