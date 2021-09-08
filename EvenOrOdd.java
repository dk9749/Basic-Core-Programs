package com.bridgelab;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter Your Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if ( a % 2==0) {
            System.out.println("The Number Is Even");
        } else {
            System.out.println("The Number Is Odd");
        }
    }
}
