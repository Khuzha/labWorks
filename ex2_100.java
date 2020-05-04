//package com.khuzha.objects;

import java.util.Scanner;

public class ex2_100 {
    public static void main(String[] args) {
        /*
         * Даны длины трех отрезков. Можно ли из них построить треугольник, будет ли он прямоугольным?
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны а:");
        float a = scan.nextInt();
        System.out.println("Введите длину стороны b:");
        float b = scan.nextInt();
        System.out.println("Введите длину стороны с:");
        float c = scan.nextInt();

        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Такого треугольника не существует.");
            return;
        } else {
            System.out.println("Прямоугольник с такими сторонами построить можно.");
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("И он будет прямоугольным.");
            } else {
                System.out.println("Такой треугольник не будет прямоугольным.");
            }
        }
        float p = (float) (0.5 * (a + b + c));
        float s = (float) (p * (p - a) * (p - b) * (p - c));
        float h = (float) (2 * Math.sqrt(s) / a);
        System.out.println("Высоты, опущенная на сторону а, равна " + h);
        return;
    }
}
