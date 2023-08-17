package com.bkuefire_fox.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //目标：掌握逻辑运算符的使用
        //需求：要求手机必须满足尺寸大于等于6.95，内存大于等于8GB
        double size = 6.8;
        int RAM = 16;
        //1. & 前后的条件的结果必须都为true，才返回true
        boolean rs = size >= 6.95 & RAM >= 8;
        System.out.println(rs);

        //需求：要么手机尺寸大于等于6.95，要么内存大于等于8GB
        //2. | 只要多个条件中一个为true，则返回true
        boolean rs2 = size >= 6.95 | RAM >= 8;
        System.out.println(rs2);

        //3. ! 取反的意思
        System.out.println(!true);//false
        System.out.println(!false);//true
        System.out.println(!(2 > 1));//false

        //4. ^ 前后条件的结果相同时返回false,不同时返回true
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(false ^ true);//true
        System.out.println(true ^ false);//true

        //5.&& 左边为false，右边不执行
        int i = 10;
        int j = 20;
        //System.out.println(i > 100 && ++j >99);
        System.out.println(i > 100 & ++j >99);
        System.out.println(j);

        //6. || 左边为true，右边不执行
        int m = 10;
        int n = 30;
        //System.out.println(m > 3 || ++n > 40);
        System.out.println(m > 3 | ++n > 40);
        System.out.println(n);


    }
}
