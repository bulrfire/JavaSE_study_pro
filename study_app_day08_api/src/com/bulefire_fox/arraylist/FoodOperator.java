package com.bulefire_fox.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 菜品操作类：负责完成对菜品的业务实现：上架，浏览信息
 */
public class FoodOperator {
    // 1.定义集合对象，负责存储商品信息
    private ArrayList<Food> foodList = new ArrayList<>();

    // 2.开发功能：上架商品。
    public void addFood(){
        // 3.创建一个菜品对象，封装菜品信息
        Food f = new Food();

        // 4.录入菜品信息
        Scanner sc =  new Scanner(System.in);
        System.out.println("name");
        String name = sc.next();
        f.setName(name);

        System.out.println("price");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("desc");
        String desc = sc.next();
        f.setDesc(desc);

        // 5.把菜品对象存入集合
        foodList.add(f);
        System.out.println("ok");
    }

    // 6.展示菜品
    public void  showAllFoods(){
        if (foodList.size() == 0){
            System.out.println("None!");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("---------------------------------");
        }
    }

    // 展示操作界面
    public void start(){
        while (true) {
            System.out.println("选择功能");
            System.out.println("1.上架商品");
            System.out.println("2.展示商品");
            System.out.println("3.退出");

            Scanner sc = new Scanner(System.in);
            System.out.println("请选择");
            String command = sc.next();
            switch (command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("下次再来哦");
                    return;
                default:
                    System.out.println("没有哦~");
            }
        }
    }
}
