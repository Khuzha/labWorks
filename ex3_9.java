//package com.khuzha.objects;

public class ex3_9 {
    public static void main(String[] args) {
        int res = 1;

        for (int digit = 1; digit < 10; digit++) {
            if (digit % 3 == 0) {
                res *= digit;
            }
        }
        System.out.println("Произведение всех цифр, кратных 3, равно " + res);
    }
}
