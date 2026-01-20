package com.mokal.whileloop;

import java.util.Scanner;

public class NaturalSum {

    public static void main(String[] args) {
        System.out.println("Calculate and print the sum of the first n natural numbers.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to couynt natura number");
        int num = sc.nextInt();

        int i = 0;
        int sum = 0;

        while (i <= num) {
            sum = sum + i;
            i++;

        }
        System.out.println("Sum of N natural number is : " + sum);
        sc.close();
    }
}