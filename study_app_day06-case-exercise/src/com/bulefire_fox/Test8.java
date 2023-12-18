package com.bulefire_fox;

public class Test8 {
    //打印乘法表
    public static void main(String[] args) {
        //控制打印多少行
        for (int i = 1; i <= 9; i++) {
            //2.定义一个内部循环控制每行多少列
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "X" + i + "=" + (j*i) + "\t");
            }
            System.out.println();//换行
        }
    }
}
