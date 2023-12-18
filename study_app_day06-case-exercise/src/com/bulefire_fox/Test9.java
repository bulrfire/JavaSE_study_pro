package com.bulefire_fox;

public class Test9 {
    /*
            *
           ***
          *****
         *******

        本质：计算机只能打印行

        先找规律，再写程序
        行(i)   空格(line-i)     *(2i-1)      换行
        1       3               1
        2       2               3
        3       1               5
        4       0               7
     */
    public static void main(String[] args) {
        //1.循环控制打印多少行
        int line = 5;
        for (int i = 1; i <= line; i++) {
            //2.控制打印多少空格
            for (int j = 1; j <= (line-i); j++) {
                System.out.print(' ');
            }

            //3.控制打印多少*
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(j % 2 == 0 ? ' ' : '*');
            }
            //4.换行
            System.out.println();
        }
    }
}
