package com.bridgelab;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " Is The Largest Number");
        } else if (b >= c && b >= a) {
            System.out.println(b + " Is The Largest Number");
        } else {
            System.out.println(c + " Is The Largest Number");
        }
    }
}
