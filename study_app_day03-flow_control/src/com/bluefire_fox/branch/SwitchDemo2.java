package com.bluefire_fox.branch;

/*
   //目标：掌握switch写法和执行流程
*/
public class SwitchDemo2 {
    public static void main(String[] args) {
        String week = "周日";
        switch (week) {
            case "周一":
                System.out.println(1);
                break;
            case "周二":
                System.out.println(2);
                break;
            case "周三":
                System.out.println(3);
                break;
            case "周四":
                System.out.println(4);
                break;
            case "周五":
                System.out.println(5);
                break;
            case "周六":
                System.out.println(6);
                break;
            case "周日":
                System.out.println(7);
                break;
            default:
                System.out.println("fuck");
        }
    }
}
