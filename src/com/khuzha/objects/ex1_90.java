package com.khuzha.objects;

import java.util.Scanner;

public class ex1_90 {
    /*
     * По данным сторонам прямоугольника вычислить его периметр, площадь и длину диагонали
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны а:");
        float a = scan.nextFloat();
        System.out.println("Введите длину стороны b:");
        float b = scan.nextFloat();


        float p = (a + b) * 2;
        float s = a * b;
        float d = (float) Math.sqrt(a * a + b * b);
        System.out.println("Параметры этого прямоугольника: \nПериметр = " + p +
                "\nПлощадь = " + s + "\nДиагональ = " + d);
    }
}
