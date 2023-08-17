package com.bluefire_fox.overload;

import java.io.OutputStream;

public class MethodTest2 {
    public static void main(String[] args) {
        //目标：掌握方法重载的应用场景
        fire();
        fire("US");
        fire("US",999);
    }

    public static void fire(){
        fire("岛国");
    }

    public static void fire(String country){
        fire(country,1);
    }

    public static void fire(String country,int number){
        System.out.println("go to " + number + " to " + country);
    }
}
