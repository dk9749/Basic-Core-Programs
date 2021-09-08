package com.bridgelab;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter Year: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int x = 0;
        if (x == a % 4){
            System.out.println("It Is A Leap Year");
        }
        else {
            System.out.println("It Is Not A Leap Year");
        }

    }
}
