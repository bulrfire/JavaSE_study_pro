package com.bulefire_fox;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //目标：完成评委打分案例
        System.out.println(getAverageScore(6));
    }

    public static double getAverageScore(int number){
        //1.定义一个动态初始化的数组存入评委的打分
        int[] scores = new int[number];

        //2.录入打分
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("录入第 " + (i+1) + " 位评委的分数");
            int score = sc.nextInt();
            scores[i] = score;
        }
        
        //3.计算总分和找出最高分最低分
        int sum = 0;
        int max = scores[0];//最大
        int min = scores[0];//最少
        
        //遍历找数据
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
            //最大
            if (scores[i] > max){
                max = scores[i];
            }
            //最小
            if (scores[i] < min){
                min = scores[i];
            }
        }
        //计算平均分，返回
        return 1.0 * (sum - max -max) / (number - 2);
    }
}
