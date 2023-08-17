package com.bluefire_fox.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        //目标：搞清楚switch使用时几点注意事项
        //1.表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String、不支持double、float、long。
        int a = 10;
        double b = 0.1;
        double b2 = 0.2;
        double c = b + b2;
        System.out.println(c);//0.30000000000000004
        switch (a) {

        }

        //2.case给出的值不允许重复，且只能是字面量，不能是变量。
        int i = 20;
        int d = 10;
        switch (i) {
            case 10:

                break;
            case 20:

                break;
        }

        //3.正常使用switch时，不要忘记写break，否则会出现穿透现象。
        String week = "周三";
        switch (week) {
            case "周一":
                System.out.println(1);
                break;
            case "周二":
                System.out.println(2);
                break;
            case "周三":
                System.out.println(3);
                //break;
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
