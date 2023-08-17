package com.bluefire_fox.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：掌握定义方法的完整格式，搞清楚使用方法的好处
        //需求：很多程序员要进行两个整数求和的操作

        //1.李工
        int rs1 = sum(10,20);
        System.out.println(rs1);

        //2.张工
        int rs2 = sum(20,30);
        System.out.println(rs2);
    }

    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
}
