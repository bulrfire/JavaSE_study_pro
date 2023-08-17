package com.bluefire_fox.demo;

public class Test1 {
    public static void main(String[] args) {
        //掌握数组元素求最值
        int[] faceScores= {15,9000,10000,20000,9500,-5};
        int max = faceScores[0];
        for (int i = 1; i < faceScores.length; i++) {
            if (faceScores[i] > max){
                max = faceScores[i];
            }
        }

        System.out.println("max "+max);
    }
}
