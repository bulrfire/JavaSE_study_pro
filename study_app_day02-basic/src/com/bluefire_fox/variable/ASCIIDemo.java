package com.bluefire_fox.variable;

public class ASCIIDemo {
    public static void main(String[] args) {
        //目标：掌握ASCII编码表的编码特点
        System.out.println('a' + 10);//97 + 10 = 107
        System.out.println('A' + 10);//65 + 10 = 75
        System.out.println('0' + 10);//48 + 10 = 58

        //二进制，八进制，十六进制在程序中的写法。
        int a1 = 0b01100001;
        System.out.println(a1);

        int a2 = 0141;
        System.out.println(a2);

        int a3 = 0xFA;
        System.out.println(a3);
    }
}
