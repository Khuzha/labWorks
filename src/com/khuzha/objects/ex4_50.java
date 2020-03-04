package com.khuzha.objects;

import java.util.Scanner;

import java.util.Scanner;
public class ex4_50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean gotNum = false;
        System.out.println("Введите значение числа n (больше нуля):");
        int n = scan.nextInt();
        float fact = 1;

        if (n <= 0) {
            System.out.println("Введите число больше нуля");
            return;
        }

        System.out.println("n = " + n);
        for (float i = 1; i <= n; i += 0.1) {
            fact *= i;
            System.out.println("i = " + i + " n = " + n + " fact = " + fact);
        }

        System.out.println("Результат равен " + fact);
    }
}
