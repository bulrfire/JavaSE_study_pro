package com.bulefire_fox.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 目标：完成拓展案例：商家菜品上架操作。
        // 1.设计菜品类Food，负责创建菜品对象，封装菜品数据
        // 2.设计菜品操作类：FoodOperator,负责完成对菜品的业务实现：上架，浏览信息
        FoodOperator operator = new FoodOperator();
        operator.start();
    }
}
