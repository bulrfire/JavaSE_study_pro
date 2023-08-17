package com.bluefre_fox.type;

public class TypeComversionDemo3 {
    public static void main(String[] args) {
        //目标：掌握强制类型转换
        int a = 20;
        //byte b = a;//报错
        byte b = (byte) a;//ALT + ENTER
        System.out.println(a);
        System.out.println(b);//20

        int c = 1500;
        byte d = (byte) c;
        System.out.println(d);

    }
}
