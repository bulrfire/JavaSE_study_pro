package com.bluefire_fox.literal;

public class LiteraDemo {
    public static void main(String[] args) {
        //目标：掌握常见数据再程序中书写格式
        //1.整数
        System.out.println(666);

        //2.小数
        System.out.println(99.5);

        //3.字符 必须用单引号围起来，有且只有一个字符
        System.out.println('a');
        System.out.println('0');
        System.out.println('中');
//      System.out.println('aa');
        System.out.println(' ');//空字符
//      System.out.println('');
        //特殊字符：\n 代表换行  \t 代表一个tab缩进
        System.out.println('中');
        System.out.println('\n');
        System.out.println('国');
        System.out.println('\t');

        //字符串，必须用双引号围起来，里面内容随意
        System.out.println("我爱你中国abc");
        System.out.println("");
        System.out.println("   ");
        System.out.println("我");

        // 5.布尔值，只有两个值。true代表真，false代表假
        System.out.println(true);
        System.out.println(false);
    }
}
