package com.bulefire_fox;

public class Test7_3 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            //i是否是素数，是输出，不是不输出
            if(check(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean check(int data){
        for (int i = 2; i < data/2; i++) {
            if (data % i == 0){
                return false;//不是
            }
        }
        return true;
    }
}
