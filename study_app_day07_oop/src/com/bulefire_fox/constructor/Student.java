package com.bulefire_fox.constructor;

public class Student {

    String name;
    double score;

    //构造器
    //无参数构造器
    public Student(){
        System.out.println("无参");
    }

    //有参数构造器
    public Student(String name,double score){
        System.out.println("有参");
        this.name = name;
        this.score = score;

    }
}
