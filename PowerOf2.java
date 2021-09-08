package com.bridgelab;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base: ");
        int base = sc.nextInt();
        System.out.println("Enter Power: ");
        int power = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        System.out.println("The Value Of " + base + " To The Power " + power + " Is " + result);
    }
}
