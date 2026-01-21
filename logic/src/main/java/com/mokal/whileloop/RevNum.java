package com.mokal.whileloop;

import java.util.Scanner;


public class RevNum {
    public static void main(String[] args) {
        System.out.println("Reverse a Number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to rev.");
        int num = sc.nextInt();

        int result = RevANumber(num);
        System.out.println(result);
    }

    private static int RevANumber(int num) {
        int rev = 0;

        while (num > 0) {
            int rem = num % 10; // get last digit
            rev = rev * 10 + rem;
            num = num / 10; // remove last digit
        }

        return rev;

    }
}
