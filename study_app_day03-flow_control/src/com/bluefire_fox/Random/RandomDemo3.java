package com.bluefire_fox.Random;

import java.util.Random;

public class RandomDemo3 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 40; i++) {
            int number = r.nextInt(10 , 30);
            System.out.println(number);
        }
    }
}
