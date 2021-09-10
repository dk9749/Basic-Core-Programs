package com.bridgelab;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n, sum = 0, total = 0;

        System.out.println("Enter The Harmonic Value N: ");
        n = sc.nextInt();

        for (double i = 1; i <= n; i++) {
            sum = sum + 1 / i;
        }
        System.out.println("The Value Of Nth Harmonic Number is " + sum);
    }
}
