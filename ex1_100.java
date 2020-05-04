//package com.khuzha.objects;

import java.util.Scanner;

public class ex1_100 {
    /*
     * Даны два числа. Найти среднее арифметическое их квадратов и среднее арифметическое их модулей
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        float a = scan.nextFloat();
        System.out.println("Введите второе число:");
        float b = scan.nextFloat();

        float sak = (a * a + b * b) / 2;
        float sam = (Math.abs(a) + Math.abs(b)) / 2;
        System.out.println("Среднее арифметическое суммы квадратов этих чисел равно: " + sak +
                "\nСреднее арифметическое их модулей равно: " + sam);
    }
}
