package ru.geekbrains.lesson1;

import javax.sound.midi.Soundbank;

public class HomeWorkApp {
    public static void main(String[] args) {
        // Вызов методов
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    // Метод №1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Метод №2
    public static void checkSumSign() {
        int a = 3, b = 8;
        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Метод №3
    public static void printColor() {
        int value = 177;
        if (value <= 0) {
            System.out.println("Красный");
        } else if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Метод №4
    public static void compareNumbers() {
        int a = 10, b = 1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
