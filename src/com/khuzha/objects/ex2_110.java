package com.khuzha.objects;

import java.util.Scanner;

public class ex2_110 {
    /*
     * Для данных вещественных чисел m, n и знака операции s вычислить n s m.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение числа m:");
        float m = scan.nextFloat();
        System.out.println("Введите значение числа n:");
        float n = scan.nextFloat();
        System.out.println("Введите нужную операцию (+, -, *, /, %");
        char s = scan.next().charAt(0);
        boolean ready = false;

        while (!ready) {
            switch (s) {
                case ('+'):
                    System.out.println("Результат: " + (m + n));
                    ready = true;
                    break;
                case ('-'):
                    System.out.println("Результат: " + (m - n));
                    ready = true;
                    break;
                case ('*'):
                    System.out.println("Результат: " + (m * n));
                    ready = true;
                    break;
                case ('/'):
                    System.out.println("Результат: " + (m / n));
                    ready = true;
                    break;
                case ('%'):
                    System.out.println("Результат: " + (m % n));
                    ready = true;
                    break;
                default:
                    System.out.println("Вы ввели неверный знак. Введите операцию, одну из: +, -, *, /, %");
                    s = scan.next().charAt(0);
            }
        }
    }
}
