package com.mokal.whileloop;
import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int product = 1;

        // Handle case when number is 0
        if (n == 0) {
            product = 0;
        } else {
            while (n > 0) {
                int digit = n % 10;
                product *= digit;
                n = n / 10;
            }
        }

        System.out.println("Product of digits: " + product);
    }


}
