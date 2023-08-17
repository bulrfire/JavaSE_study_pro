package com.bluefre_fox.type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        //目标：掌握表达式的自动类型转换机制。
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs = a + b + c;
        System.out.println(rs);

        double rs1 = a + b + 10;
        System.out.println(rs1);

        byte i = 10;
        short j = 20;
        int rs2 = i + j;
        System.out.println(rs2);

        //面试笔试题
        byte b1 = 10;
        byte b2 = 80;
        int rs3 = b1 + b2;
        System.out.println(rs3);
    }
}
