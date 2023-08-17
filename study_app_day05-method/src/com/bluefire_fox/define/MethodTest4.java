package com.bluefire_fox.define;

public class MethodTest4 {
    public static void main(String[] args) {
        //目标：掌握设计方法的技巧。
        int rs = sum(5);
        System.out.println(rs);

        int rs2 = sum(100);
        System.out.println(rs2);
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
