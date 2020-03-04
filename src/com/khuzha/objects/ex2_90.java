package com.khuzha.objects;

import java.util.Scanner;

public class ex2_90 {
    public static void main(String[] args) {
        /*
         * Даны целые k, l, n, m. выяснить, является ли k делителем всех чисел
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение числа k:");
        float k = scan.nextFloat();
        System.out.println("Введите значение числа l:");
        float l = scan.nextFloat();
        System.out.println("Введите значение числа m:");
        float m = scan.nextFloat();
        System.out.println("Введите значение числа n:");
        float n = scan.nextFloat();

        if (l % k == 0 && m % k == 0 && n % k == 0) {
            System.out.println("Все эти числа можно разделить на число k без остатка.");
        } else {
            System.out.println("Одно из этих чисел делится на число k с остатком");
        }
    }
}
