package com.bluefire_fox.Scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //1.导包:一般不需要自己做，idea工具会自动帮我们导包
        //2.抄代码：得到一个键扫描器对象（东西）
        Scanner sc = new Scanner(System.in);

        //3.调用sc的功能，来接收用户键盘输入的数据
        System.out.println("年龄：");
        int age = sc.nextInt();//执行到这等待用户输入整数，知道用户按下回车键，才会拿到数据
        System.out.println("年龄是：" + age);

        System.out.println("名字");
        String name = sc.next();//执行到这等待用户输入字符串，知道用户按下回车键，才会拿到数据
        System.out.println("欢迎" + name);
    }
}
