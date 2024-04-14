package com.bulefire_fox.string;

public class StringDemo3 {
    public static void main(String[] args) {
        //目标：搞清楚String使用时的几个注意事项
        //1.String的对象是不可变的?
        String name = "bulefire";
        name += "_fox";
        name += "520";
        System.out.println(name);

        //2.以“...”给出的字符串对象，会存储在堆内存的常量池中，相同内容只会存一份
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true

        //3.new方式产生字符串对象，每次new出来的都是新对象，放在堆内存中
        char[] chars = {'a','b','c'};
        String a1 = new String(chars);
        String a2 = new String(chars);
        System.out.println(a1 == a2);//false
    }
}
