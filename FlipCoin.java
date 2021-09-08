package com.bridgelab;

public class FlipCoin {
    public static void main(String[] args) {
        //int max = 2;
        //int min = 0;

       // int a = (int) (Math.random()*(max - min +1) + min);

        int a = (int)(Math.random()*3);

        if (a == 1){
            System.out.println("Head");
        }
        else if (a == 2){
            System.out.println("Tail");
        }
        else{
            System.out.println("Cancel");
        }

    }
}
