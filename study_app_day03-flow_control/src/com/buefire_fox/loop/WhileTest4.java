package com.buefire_fox.loop;

public class WhileTest4 {
    public static void main(String[] args) {
        //目标：使用while循环解决问题并理解什么情况下使用while，for。
        //1.定义变量记住珠穆朗玛峰和纸张的厚度
        double Hill_High = 8848860;
        double paper_side_long = 0.1;
        //2.定义count记住折叠的次数
        int count = 0;
        int count2 = 0;
        //定义while循环控制纸张开始折叠
        while (paper_side_long < Hill_High) {
            //纸张厚度*2
            paper_side_long *= 2;
            count++;
        }
        System.out.println(count);
        System.out.println(paper_side_long);

        for (;paper_side_long < Hill_High;) {
            //纸张厚度*2
            paper_side_long *= 2;
            count2++;
        }
        System.out.println(count);
        System.out.println(paper_side_long);
    }
}