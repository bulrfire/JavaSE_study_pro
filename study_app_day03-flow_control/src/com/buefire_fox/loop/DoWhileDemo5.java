package com.buefire_fox.loop;

public class DoWhileDemo5 {
    public static void main(String[] args) {
        //目标：掌握do-while书写格式以及执行流程。特点和应用场景
        //打印多行Hello World
        int i = 0;
        do{
            System.out.println("Hello World");
            i++;
        }while (i <3);

        //特点：先执行，后判断
        do{
            System.out.println("Hello World2");
        }while(false);

        System.out.println("-------------------------------------------------------------------");

        for (int j = 0; j < 3; j++ );{
            System.out.println("Hello World3");
        }
        //System.out.println(j);

        for (int j = 0; j < 3; j++ );{
            System.out.println("Hello World4");
        }
        int m = 0;
        while (m < 3){
            System.out.println("Hello World5");
            m++;
        }
        System.out.println(m);
    }
}
