package ru.geekbrains.lesson3;

import java.util.Random;

public class HomeWorkApp {
    public static void  main(String[] args) {
        int[] arr1 = {0, 0, 1, 1, 1, 0, 0, 0, 1, 1};
        int[] arr2 = {1, 2, 3, 6, 4, 11, 9, 10, 7, 8};
        int[] arr3 = {1, 2, 3, 6, 12};

        // Вызов методов
        System.out.println("Задание №1");
        arrReplacement(arr1);
        System.out.println("Задание №2");
        arr100();
        System.out.println("Задание №3");
        arrMultiplier2(arr2);
        System.out.println("Задание №4");
        arrDiagonal(5);
        System.out.println("Задание №5");
        arrInit(10,7);
        System.out.println("Задание №6");
        arrMinMax(10);
        System.out.println("Задание №7 - " + checkBalance(arr3));
        System.out.println("Задание №8");
        offsetArr(arr2, -13);

    }

    //Метод №1
    public static void arrReplacement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Метод №2
    public static void arr100() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
            if (i == 50) {
                System.out.println();
            }
        }
        System.out.println();
    }

    //Метод №3
    public static void arrMultiplier2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    //Метод №4
    public static void arrDiagonal(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == j) || (i + j == a - 1)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Метод №5
    public static void arrInit(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Метод №6
    public static void arrMinMax(int len) {
        int arr[] = new int[len];
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = rnd.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0], max = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min - " + min);
        System.out.println("Max - " + max);
    }

    //Метод №7
    public static boolean checkBalance(int[] arr) {
        double sum = 0, halfSum;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        halfSum = sum / 2;
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == halfSum) {
                return true;
            }
        }
        return false;
    }

    //Метод №8
    public static void offsetArr(int[] arr, int n) {
        int offset = n % arr.length; //узнали смещение в пределах размера массива
        int buffer;

        System.out.println("Начальный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // смещение вправо
        if (offset > 0) {
            for (int i = 0; i < Math.abs(offset); i++) {    // количество повторов смещения на 1
                buffer = arr[arr.length -1];
                for (int j = arr.length - 1; j > 0; j--) {  // смещение на 1 в нужную сторону
                    arr[j] = arr[j-1];
                }
                arr[0] = buffer;
            }
        }

        // смещение влево
        if (offset < 0) {
            for (int i = 0; i < Math.abs(offset); i++) {    // количество повторов смещения на 1
                buffer = arr[0];
                for (int j = 0; j < arr.length -1; j++) {   // смещение на 1 в нужную сторону
                    arr[j] = arr[j+1];
                }
                arr[arr.length -1] = buffer;
            }
        }

        System.out.println("Массив со смещением " + n + " (" + offset + "):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
