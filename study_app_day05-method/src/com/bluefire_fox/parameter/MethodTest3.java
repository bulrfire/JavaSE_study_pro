package com.bluefire_fox.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        //目标：完成打印int类型的数组内容
        int[] arr = {10,30,50,70};
        outAry(arr);

        int[] arr2 = null;
        outAry(arr2);

        int[] arr3 = {};
        outAry(arr3);
    }

    public static void outAry(int[] arr){

        if (arr == null){
            System.out.println(arr);
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            }
//            else{
//                System.out.print(arr[i] + ",");
//            }
            System.out.print(i == arr.length - 1 ? arr[i]:arr[i] + ", ");
        }
        System.out.println("]");
    }
}
