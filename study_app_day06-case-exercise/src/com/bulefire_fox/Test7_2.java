package com.bulefire_fox;

public class Test7_2 {
    //完成找素数2
    public static void main(String[] args) {
        int count = 0;
        //1.定义for循环遍历每一个数

        OUT://为外部循环指定标签
        for (int i = 101; i <= 200; i++) {

            //2.拦截判断是否是素数
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0){
                    //i不是素数
                    continue OUT;//结束外部循环
                }
            }

            count++;
            System.out.println(i);
        }

        System.out.println("now" + count);
    }
}

