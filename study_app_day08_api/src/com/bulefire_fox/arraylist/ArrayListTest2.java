package com.bulefire_fox.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        //1.创建一个ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);

        //2.从集合中找出包含枸杞的数据并删除它
        /*
        for (int i = 0; i < list.size(); i++) {
            //取出当前遍历到的数据
            String ele =  list.get(i);
            //判断数据中包含枸杞
            if (ele.contains("枸杞")){
                //删除
                list.remove(ele);
            }
        }

        System.out.println(list);

       */

         /*
        //方式1：删除后后退一步
        for (int i = 0; i < list.size(); i++) {
            //取出当前遍历到的数据
            String ele =  list.get(i);
            //判断数据中包含枸杞
            if (ele.contains("枸杞")){
                //删除
                list.remove(ele);
                i--;
            }
        }

        System.out.println(list);

         */

        //方法2：从集合后面倒着遍历并删除
        for (int i = list.size() -1; i>= 0; i--){
            //取出当前遍历到的数据
            String ele =  list.get(i);
            //判断数据中包含枸杞
            if (ele.contains("枸杞")){
                //删除
                list.remove(ele);
            }
        }

        System.out.println(list);
    }
}
