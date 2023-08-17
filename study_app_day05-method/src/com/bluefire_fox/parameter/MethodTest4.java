package com.bluefire_fox.parameter;

public class MethodTest4 {
    public static void main(String[] args) {
        //目标：完成判断两个int类型的数组是否一样

        int[] arr1 = {10,20,30};
        int[] arr2 = {10,20,30};
        System.out.println(equals(arr1,arr2));
    }

    public static boolean equals(int[] arr1,int[] arr2){
        //1.判断是否都为null
        if (arr1 ==null && arr2 ==null){
            return true;
        }


        //2.判断arr1 或 arr2a一个为null
        if(arr1 == null || arr2 == null){
            return false;
        }

        //3.判断长度是否一样
        if (arr1.length != arr2.length){
            return false;
        }

        //4.长度一样，比较内容
        for (int i = 0; i < arr1.length; i++) {
            //判断当前位置元素是否不一样
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
