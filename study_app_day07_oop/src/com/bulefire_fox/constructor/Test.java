package com.bulefire_fox.constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识构造器，并掌握构造器特点，应用场景，注意事项
        Student s = new Student();
        Student s1 = new Student("bo zai",99);

        Student s2 = new Student();
        s2.name = "bo niu";
        s2.score = 100;

        Student s3 = new Student("small black",59);
        System.out.println(s3.name);
        System.out.println(s3.score);

        Teacher t = new Teacher();
    }
}
