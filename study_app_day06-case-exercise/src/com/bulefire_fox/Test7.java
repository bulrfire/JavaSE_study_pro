package com.bulefire_fox;

public class Test7{
    public static void main(String[] args) {
        //目标：完成找素数
        System.out.println("now " + search(101, 200));
    }

    public static int search(int start,int end){
        int count = 0;

        //1.定义for循环遍历每一个数
        for (int i = start; i <= end; i++) {

            //信号位思想
            boolean flag = true; //假设i是素数

            //2.判断是否是素数
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0){
                    //i不是素数
                    flag = false;
                    break;
                }
            }
            //3.根据结果决定是否输出i，素数输出
            if (flag){
                System.out.println(i);
                count++;
            }
        }

        return count;
    }
}
