package com.bulefire_fox.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    //目标：掌握如何创建array list及常用方法
    public static void main(String[] args) {
        //1.创建对象
        //ArrayList<String> list = new ArrayList<String>();
        //从jdk-1.7开始支持
        ArrayList<String> list = new ArrayList<>();
        list.add("蓝火");
        list.add("蓝火");
        list.add("Java");
        System.out.println(list);

        //2.往集合种某个索引位置插入数据
        list.add(1,"mySQL");
        System.out.println(list);

        //3.返回指定索引处的元素
        String rs = list.get(1);
        System.out.println(rs);

        //4.返回集合大小（返回元素个数）
        System.out.println(list.size());

        //5.删除某个索引处的元素，返回被删除的元素值
        System.out.println(list.remove(1));
        System.out.println(list);

        //6.直接删除指定元素，返回删除是否成功
        System.out.println(list.remove("Java"));
        System.out.println(list);

        list.add(1,"html");
        System.out.println(list);

        //默认删除第一次出现的数据
        System.out.println(list.remove("蓝火"));
        System.out.println(list);

        //7.修改指定索引处的数据，成功会返回原来的数据
        System.out.println(list.set(1, "蓝火·狐"));
        System.out.println(list);

    }
}
