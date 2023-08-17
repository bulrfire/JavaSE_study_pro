package com.bluefire_fox.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //目标：完成随机排名
        int[] codes = new int[5];
        //录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("NO." + (i + 1) + "code:");
            int code = sc.nextInt();
            codes[i] = code;
        }

        //打乱数组数据
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            //每遍历到一个数据都生成随机索引让遍历的数据于该索引位置处交换
            int index = r.nextInt(codes.length);
            //交换
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }

        //输出
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}
