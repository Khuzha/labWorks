//package com.khuzha.objects;

import java.util.Scanner;

public class ex4_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n:");
        long n = scan.nextInt();
        long pp = 0;
        long p = 1;

        for (int i = 2; i <= n; ++i) {
            long next = pp + p;
            pp = p;
            p = next;
        }

        System.out.println("Число Фибоначчи с порядковым номером " + n + " равно " + p);
    }
}
