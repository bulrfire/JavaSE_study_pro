package com.bulefire_fox.demo;

/*
*   目标：完成电影展示功能；根据电影id查询电影想起
*   电影数据：
*       1."水门桥",38.9,9.8,"徐克","吴京","12w人想看"
*       2."出拳吧",39,7.8,"唐晓白","田雨","3.512w人想看"
*       3."月球陨落",42,7.9,"罗兰","贝瑞","17.912w人想看"
*       4."一点就到家",35,8.7,"许宏宇","刘昊然","10.812w人想看"
* */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //准备全部电影数据
        Movie[] movie = new Movie[4];
         movie[0] = new Movie(1,"水门桥",38.9,9.8,"徐克","吴京","12w人想看");
         movie[1] = new Movie(2,"出拳吧",39,7.8,"唐晓白","田雨","3.512w人想看");
         movie[2] = new Movie(3,"月球陨落",42,7.9,"罗兰","贝瑞","17.912w人想看");
         movie[3] = new Movie(4,"一点就到家",35,8.7,"许宏宇","刘昊然","10.812w人想看");

        //创建一个show对象
        Show show = new Show(movie);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====电影信息系统====");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询电影详细信息");
            System.out.println("输入");
            int command = sc.nextInt();
            switch(command){
                case 1:
                    show.printAllMovies();
                    break;
                case 2:
                    System.out.println("请输入id");
                    show.searchMovieByID(sc.nextInt());
                    break;
                default:
                    System.out.println("命令有问题");
            }
        }
    }
}
