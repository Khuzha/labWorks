package com.khuzha.objects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FillArr ArrMW = new FillArr();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве a:");
        float arr[] = ArrMW.fill(scan.nextInt());
        System.out.println("Введите значение числа b:");
        float b = scan.nextFloat()  ;
        int i;

        for (i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if (arr[i] < b) {
                break;
            }
        }

        System.out.println("Номер элемента: " + i);
    }
}
