package com.bulefire_fox.string;

public class StringDemo2 {
    public static void main(String[] args) {
        // 目标：快速熟悉String提供的处理字符串的常用办法
        String s = "bulefire_fox";

        //1.获取字符串的长度
        System.out.println(s.length());

        //2.提取字符串中索引位置处的字符
        System.out.println(s.charAt(5));

        //3.字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println("-------------------------------");

        //把字符串变成字符数组
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        //4.判断字符串内容是否一样，一样true
        String s1 = new String("bule");
        String s2 = new String("bule");
        System.out.println(s1 == s2);//false 判断地址
        System.out.println(s1.equals(s2));//true 判断内容

        //5.忽略大小写判断字符串内容是否一样
        String c1 = "34a1fg";
        String c2 = "34A1Fg";
        System.out.println(c1.equals(c2));//false
        System.out.println(c1.equalsIgnoreCase(c2));//true

        //6.截取字符串内容
        String s3 = "bulefire_fox";
        System.out.println(s3.substring(0, 8));

        //7.从当前索引位置一直截取到字符串末尾
        System.out.println(s3.substring(9));

        //8.替换字符串中某个内容替换成新内容。并返回新的字符串对象
        String info = "你个SB";
        System.out.println(info.replace("SB", "**"));

        //9.判断字符串中是否包含某个关键字
        String info2 = "我爱Java，Java不爱我";
        System.out.println(info2.contains("Java"));//true
        System.out.println(info2.contains("java"));//false

        //10.判断字符串有没有以某个字符串开头
        String s4 = "mike";
        System.out.println(s4.startsWith("m"));//true
        System.out.println(s4.startsWith("mi"));//true
        System.out.println(s4.startsWith("mie"));//false

        //11.把字符串按照某个指定内容分割成多个字符串，放到字符串数组中
        String s5 = "a,b,c,d,e,f";
        String[] name = s5.split(",");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
