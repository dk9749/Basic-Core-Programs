package com.bridgelab;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("Enter Number1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Number2: ");
        int b = sc.nextInt();

        double x = a / b;
        double y = a % b;

        System.out.println("The Quotient Value is: " + x);
        System.out.println("The Remainder Value is: " + y);
    }

}
