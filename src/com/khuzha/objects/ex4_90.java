package com.khuzha.objects;

import java.util.Scanner;

public class ex4_90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean gotNum = false;
        System.out.println("Введите значение числа k (больше нуля):");
        int k = scan.nextInt();
        float fact = 1;

        if (k <= 0) {
            System.out.println("Факторриал бывает только у неотрицательных чисел.");
            return;
        }

        System.out.println("k = " + k);
        for (int i = 1; i <= k; i++) {
            fact *= (float) i;
        }

        System.out.println("Факториал числа " + k + " равен " + fact);
    }
}
