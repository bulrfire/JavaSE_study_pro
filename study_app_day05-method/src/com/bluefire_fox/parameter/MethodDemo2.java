package com.bluefire_fox.parameter;

public class MethodDemo2 {
    public static void main(String[] args) {
        //x理解引用类型的参数传递机制；值传递
        int[] arrs = new int[] {10,20,30};
        changed(arrs);
        System.out.println("main" + arrs[1]);//222
    }

    public static void changed(int[] arrs){
        System.out.println("1" + arrs[1]);//20
        arrs[1] = 222;
        System.out.println("2" + arrs[1]);//222
    }
}
