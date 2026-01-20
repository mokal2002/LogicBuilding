package com.mokal.whileloop;

import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        System.out.println("Calculate the sum of all even numbers from 1 up to n.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        int result = SumEvenNum(num);
        System.out.println("Sum is : "+ result);

        sc.close();
    }

    public static int SumEvenNum(int num) {

        int i = 1;
        int sum = 0;

        while (i <= num) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;

    }
}
