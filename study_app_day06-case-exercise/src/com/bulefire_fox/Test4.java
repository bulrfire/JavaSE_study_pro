package com.bulefire_fox;

public class Test4 {
    public static void main(String[] args) {
        //目标：完成数字加密程序
        System.out.println("out:" + encrypt(8346));
    }

    public static String encrypt(int number){
        //1.把密码拆分成一个个的数字
        int[] numbers = split(number);

        //2.遍历数组中的每个数字，对其进行加密处理
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }

        //3.反转
        reverse(numbers);

        //4.把加密的数字拼接并返回
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }

    public static void reverse(int[] numbers) {
        //反转数组
        for (int i = 0,j = numbers.length - 1; i < j; i++,j--) {
            //交换i和j位置处的值
            int tmp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = tmp;
        }
    }

    public static int[] split(int number) {
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;
        return numbers;
    }
}
