package com.bluefire_fox.branch;

public class IFDemo1 {
    public static void main(String[] args) {
        //目标：掌握if分支三种形式的用法和执行流程
        //需求：测量用户体温，高于37度报警
        double t = 36.9;
        if (t > 37){
            System.out.println("fuck");
        }

        //需求：发红包  钱包余额99元，现在发出90元.如果钱够，触法发红包，如果不够，则提示
        double money = 19;
        if (money >= 90){
            System.out.println("yes");
        }
        else {
            System.out.println("fuck");
        }

        //需求：某个公司有一个绩效系统，根据员工的打分输出对应的绩效级别
        // 【0~60】D 【60~80】C 【80~90】B 【90~100】A
        int score = 78;
        if (score >= 0 && score < 60) {
            System.out.println("D");
        }
        else if (score >= 60 && score < 80){
            System.out.println("C");
        }
        else if (score >= 80 && score < 8890){
            System.out.println("B");
        }
        else if (score >= 90 && score <= 100 ){
            System.out.println("A");
        }
        else {
            System.out.println("fuck");
        }
    }
}
