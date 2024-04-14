package com.bulefire_fox.string;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        //1.开发一个登陆界面
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("User name");
            String useName = sc.next();
            System.out.println("pass world");
            String passWorld = sc.next();

            //调用登录方法
            boolean rs = login(useName,passWorld);
            if (rs){
                System.out.println("welcome! " + useName);
                break;
            }else{
                System.out.println("Please check the User name or pass world");

            }
        }
    }

    //开发一个登录方法
    public static boolean login(String userName,String passWorld){
        //3.准备正确的
        String okUserName = "bulefire_fox";
        String okPassWorld = "123456";

        //4.判断
//        if (userName.equals(okUserName) && passWorld.equals(okPassWorld)){
//            //成功
//            return true;
//        }else{
//            return false;
//        }

        return userName.equals(okUserName) && passWorld.equals(okPassWorld);
    }
}
