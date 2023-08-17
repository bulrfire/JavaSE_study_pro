package com.bluefire_fox.Random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //目标：掌握使用Random生成随机数的步骤
        //1.导包
        //2.创建一个Random对象，用于生成随机数
        Random r = new Random();
        //3.调用Random提供的功能：nextInt得到随机数
        for (int i = 0; i < 20; i++) {
            int number = r.nextInt(10);//0 - 9
            System.out.println(number);
        }

        System.out.println("-------------------------------");

        //1 - 10
        for (int i = 0; i < 20; i++) {
            int number = r.nextInt(10) + 1;//1 - 10
            System.out.println(number);
        }

        System.out.println("----------------------------------");

        //3 - 17
        for (int i = 0; i < 20; i++) {
            int number = r.nextInt(15) + 3;
            System.out.println(number);
        }
    }
}
