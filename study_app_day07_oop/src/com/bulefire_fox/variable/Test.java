package com.bulefire_fox.variable;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚成员变量和局部变量的区别
        //1.类中位置不同：成员变量（类中，方法外）局部变量（常见于方法中）
        int a = 20;

        //2.初始化值不同：成员变量（有默认值,无需初始化）局部变量（没有默认值，使用之前需要完成赋值）
        int b;
        b = 20;
        System.out.println(b);
        //3.内存位置不同：成员变量（堆内存）局部变量（栈内存）

        //4.生命周期不同：成员变量（随着对象的创建而存在，随着对象的消失而消失）局部变量（随着方法的调用而存在，随着方法的运行结束而消失）
        String name = "bulefire_fox";

        //5.作用域：成员变量（   ）局部变量（在所归属的大括号中）
    }
}
