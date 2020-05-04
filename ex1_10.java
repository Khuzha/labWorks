//package com.khuzha.objects;

import java.util.Scanner;

public class ex1_10 {
    /*
     * Три сопротивления R1, R2, R3 соединены параллельно. Найти сопротивление соединения
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение сопротивления R1:");
        float r1 = scan.nextFloat();
        System.out.println("Введите значение сопротивления R2:");
        float r2 = scan.nextFloat();
        System.out.println("Введите значение сопротивления R3:");
        float r3 = scan.nextFloat();

        System.out.println("Сопротивление параллельной цепи равно " + (r1 + r2 + r3));
    }
}
