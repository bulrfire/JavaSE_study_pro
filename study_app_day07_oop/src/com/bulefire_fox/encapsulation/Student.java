package com.bulefire_fox.encapsulation;

public class Student {

    private double score;

    public void setScore(double score){
        if (score >=0 && score <=100) {
            this.score = score;
        }else{
            System.out.println("数据非法");
        }
    }

    public double getScore(){
        return this.score;
    }

    public void printPass(){
        System.out.println(this.score > 60 ? "pass" : "no pass");
    }
}
