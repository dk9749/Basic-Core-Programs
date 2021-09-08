package com.bridgelab;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter Alphabet: ");
        Scanner sc = new Scanner(System.in);
        char alphabet = (char) sc.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println("It Is A Vowel");
        } else {
            System.out.println("It Is A Consonant");
        }
    }
}
