package com.bluefire_fox.define;

public class ArrayTest4 {
    public static void main(String[] args) {
        //目标:完成对数组元素求和
        //1.定义一个数组存储5名员工的销售额
        int[] money = {16,26,36,6,100};

        //3.定义一个变量用于累加求和
        int sum = 0;

        //2.遍历数组每一个数据
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("all:" + sum);
    }
}
