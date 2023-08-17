package com.bluefire_fox.Random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {

        int number2 = 0;
        Random r = new Random();

        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("in number");
            int guess = sc.nextInt();

            if (guess > number){
                System.out.println("big");
                number2++;
            }

            else if (guess < number){
                System.out.println("small");
                number2++;
            }

            else{
                System.out.println("yse");
                System.out.println(number2);
                break;
            }
        }
    }
}
