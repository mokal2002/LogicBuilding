package com.mokal.whileloop;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Count and print the total number of digits in a given number.");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        // Special case: if number is 0
        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                count++;          // count one digit
                number = number / 10; // remove last digit
            }
        }

        System.out.println("Total digits = " + count);
        sc.close();
    }
}
