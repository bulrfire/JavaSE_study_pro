package com.buefire_fox.loop;

public class ForDemo {
    public static void main(String[] args) {
        //目标：掌握for循环的书写格式，并理解其执行流程
        //需求：打印多行Hello World
        /**
            流程：
                首先会执行初始化语句：int i = 0;
                i = 0,判断循环条件 0 < 3 ，返回true，计算机会进入循环输出第一行Hello World，接着执行迭代语句 i++
                i = 1,判断循环条件 1 < 3 ，返回true，计算机会进入循环输出第一行Hello World，接着执行迭代语句 i++
                i = 2,判断循环条件 2 < 3 ，返回true，计算机会进入循环输出第一行Hello World，接着执行迭代语句 i++
                i = 3,判断循环条件 3 < 3 ，返回false，循环立即结束
         */
        for (int i = 0; i < 3; i++) {
            //i = 0  1  2
            System.out.println("Hello World");
        }

        System.out.println("--------------------------------------------------------");

        for (int i = 1; i <= 5; i++) {
            //i = 1 2 3 4 5
            System.out.println("Hello World2");
        }

        System.out.println("---------------------------------------------------------");

        for (int i =1; i <=10; i += 2) {
            // 1 3 5 7 9
            System.out.println("Hello World3");
        }
    }
}
