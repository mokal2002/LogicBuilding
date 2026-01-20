package com.mokal.whileloop;

import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
    //     System.out.println("Calculate the sum of all odd numbers from 1 up to n");

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter num");
    //     int num = sc.nextInt();

    //     int result = SumOddNum(num);
    //     System.out.println(result);
    // }

    // private static int SumOddNum(int num) {
    //     int i = 1;
    //     int sum = 0;

    //     while (i <= num) {
    //         if (i % 2 != 0) {
    //             sum += i;
    //         }
    //         i++;

    //     }
    //     return sum;


     Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive number greater than 0.");
            return;
        }

        long sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;   // only odd numbers
            i += 2;
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }
}
