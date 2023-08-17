package com.bluefire_fox.define;

import java.util.Scanner;

public class MethodTest5 {
    public static void main(String[] args) {
        //需求：判断一个数是奇数还是偶数

        Scanner sc = new Scanner(System.in);
        System.out.println("in");
        judge(sc.nextInt());
    }
    public static void judge(int number){
        if (number % 2 == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
}
