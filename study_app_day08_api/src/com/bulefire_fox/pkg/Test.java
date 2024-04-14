package com.bulefire_fox.pkg;

import com.bulefire_fox.pkg.bulefire_fox.Demo2;
import com.bulefire_fox.pkg.itcast.Demo1;

import java.util.Random;
import java.util.Scanner;

/**
 * 目标：掌握如何在自己的程序中调用其他包下的程序，有哪些注意事项
 */
public class Test {
    public static void main(String[] args) {
        //1.同一包下的程序，可以直接访问
        Demo d = new Demo();
        d.print();

        //2.访问其他包下的程序，必须导包才可以访问
        Demo1 d1 = new Demo1();
        d1.print();

        //3.自己程序中调用Java提供的程序，也要导包才可以使用；主要：Java.lang包下的程序不用我们导包，可以直接使用
        Scanner sc = new Scanner(System.in);
        String s = "bulefire_fox";
        Random r = new Random();

        //4.访问多个其他包下的，这些程序名又一样的情况下，默认只能导入一个程序，另一个程序必须带包名和类名来访问
        Demo2 d2 = new Demo2();
        d2.print();

        com.bulefire_fox.pkg.itcast.Demo2 d3 = new com.bulefire_fox.pkg.itcast.Demo2();
        d3.print();
    }
}
