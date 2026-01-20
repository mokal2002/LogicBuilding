package com.mokal.whileloop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("'Print the multiplication table of a given number from n × 1 to n × 10");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number You want to print Table");
        int num = sc.nextInt();

        int i = 1;
         
        while (i <= 10) {
            System.out.println(num + " X "+ i + " = " + (num*i));
            i++;
        }
        sc.close();
    }
}
