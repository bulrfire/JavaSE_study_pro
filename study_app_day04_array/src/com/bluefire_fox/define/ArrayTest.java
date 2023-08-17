package com.bluefire_fox.define;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        //目标：完成评委打分的案例
        //1.定义一个动态初始化数组，负责存6个评委的打分
        double[] score = new double[6];

        Scanner sc = new Scanner(System.in);

        //2.遍历数组中每一个位置，录入分数，存入
        for (int i = 0; i < score.length; i++) {
            System.out.println("score in NO."+ (i + 1));
            double in = sc.nextDouble();
            score[i] = in;
        }

        double sum = 0;
        //3.遍历数组每个元素求和
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("end score is" +' ' + sum / score.length);
    }
}
