package com.bluefire_fox.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        //理解switch穿透性的作用
        String week = "周五";
        switch (week) {
            case "周一":
                System.out.println(1);
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println(2);
                break;
            case "周五":
                System.out.println(5);
                break;
            case "周六":
            case "周日":
                System.out.println(6);
                break;
            default:
                System.out.println("fuck");
        }
    }
}
