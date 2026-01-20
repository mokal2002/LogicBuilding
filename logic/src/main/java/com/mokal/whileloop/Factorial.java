package com.mokal.whileloop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Calculate and print the factorial of a given number.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        int result = factorial(n);
        System.out.println(result);
        // if (n < 0) {
        //     System.out.println("Factorial is not defined for negative numbers.");
        //     return;
        // }

        // long factorial = 1;
        // int i = 1;

        // while (i <= n) {
        //     factorial *= i;
        //     i++;
        // }

        // System.out.println("Factorial of " + n + " is: " + factorial);
        

    }

    private static int factorial(int num) {
        int i = 1;
        int fact = 1;

        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
