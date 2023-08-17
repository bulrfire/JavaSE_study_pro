package com.bkuefire_fox.operator;

public class OperatorDEMO1 {
    public static void main(String[] args) {
        //目标：掌握基本运算符的使用
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);//20
        System.out.println(a / b);//5
        System.out.println(5 / 2);//2.5 ==> 2
        System.out.println(5.0 / 2);//2.5

        int i = 5;
        int j =2;
        System.out.println(1.0 * i / j);//2.5

        System.out.println(a % b);//0
        System.out.println(3 % 2);//1

        System.out.println("------------------------------------------------------");

        //目标2：掌握使用+符号做连接符的情况
        int a2 = 5;
        System.out.println("abc" + a2);//"abc5"
        System.out.println(a2 + 5);//10
        System.out.println("bluefire_fox" + a2 + 'a');//"bluefire_fox5a"
        System.out.println(a2 + 'a' + "bluefire_fox");//5 + 97 = 102bluefire_fox

    }
}
