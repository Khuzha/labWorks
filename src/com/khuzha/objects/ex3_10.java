package com.khuzha.objects;

public class ex3_10 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 9; i++) {
            if (i % 3 == 0) {
                sum++;
            }
        }

        System.out.println("sum = " + sum);
    }
}
