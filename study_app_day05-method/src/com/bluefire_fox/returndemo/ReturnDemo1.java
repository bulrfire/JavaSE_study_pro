package com.bluefire_fox.returndemo;

public class ReturnDemo1 {
    public static void main(String[] args) {
        //目标：掌握return单独使用：return;在无返回值方法中的作用：跳出并立即结束当前方法的执行
        System.out.println("begin");
        chu(10,0);
        System.out.println("end");
    }

    public static void chu(int a,int b){
        if(b == 0){
            System.out.println("bugs");
            return;//跳出并立即结束当前方法的执行
        }
        int c = a / b;
        System.out.println("out:" + c);
    }
}
