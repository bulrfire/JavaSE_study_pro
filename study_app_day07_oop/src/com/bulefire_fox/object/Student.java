package com.bulefire_fox.object;

public class Student {
    //成员变量（对象的属性）
    String name;
    double chinese;
    double math;

    //成员方法（对象的行为）
    public void printTotalScore()
    {
        System.out.println(name + "的总成绩" + (chinese + math));
    }

    public void printAverageScore(){
        System.out.println(name + "的平均成绩" + (chinese + math) / 2.0);
    }
}

class Phone{

}