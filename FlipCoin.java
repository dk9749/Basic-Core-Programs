package com.bridgelab;

public class FlipCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;

        for (int i = 1; i <= 10; i++) {
            int random = (int) (Math.random() * 2);

            if (random == 1) {
                head = head + 1;
            } else if (random == 0) {
                tail = tail + 1;
            }
        }

        int percent_head = head * 100 / 10;
        System.out.println("Percentage Of Head Coin: " + percent_head + "%");
        int percent_tail = tail * 100 / 10;
        System.out.println("Percentage Of Tail Coin: " + percent_tail + "%");

    }
}
