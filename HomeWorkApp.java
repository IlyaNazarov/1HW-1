package ru.geekbrains.HomeWorkApp;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main (String[] args) {
//        printThreeWords
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
//                checkSumSign
        int a = 3;
        int b = 5;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        }
        if ((a + b) <= 0) {
            System.out.println("Сумма отрицательная");
        }
//        printColor
        int value = 0;
        if (value<= 0) {
            System.out.println("Красный");
        }
        if (0<value && value<=100) {
            System.out.println("Желтый");
        }
        if (value>100) {
            System.out.println("Зеленый");
        }
//        compareNumbers
        int A = 3;
        int B = 3;
        if (A >= B) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    }

