package com.bluefire_fox.variable;

public class VariableDemo {
    public static void main(String[] args) {
        //目标：掌握常见的基本数据类型的使用。
        //1.byte short int long
        byte age = 127;//-128 ~ 127
        //byte age = 128;//越界了

        short s = 13244;
        //short s1 = 93244;//越界了

        int a = 456815515;

        //注意：随便写一个整形字面量默认是int类型。554651685135216虽然没超long的范围，但超过了本身int的类型
        //如果希望随便写一整形字面量默认是long类型的，需要在后面加上 ’L‘ or ’l‘
        long l = 554651685135216L;

        //2.float double
        //随便写小数字面量，默认是double，如希望小数是float，再后面加 ’F‘ or ’f‘
        float c = 3.14F;

        double s5 = 52.652;

        //char 字符型
        char a1 = 'a';
        char a3 = '中';

        //4.boolean
        boolean x = true;
        boolean x1 = false;

        //拓展一种引用数据类型，后面要有
        //String 称之为字符串类型，定义变量可以用于记住字符串
        String name = "张三";
        System.out.println(name);
    }
}
