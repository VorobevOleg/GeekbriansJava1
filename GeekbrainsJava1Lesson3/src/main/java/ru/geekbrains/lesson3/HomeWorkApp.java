package ru.geekbrains.lesson3;

public class HomeWorkApp {
    public static void  main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 0, 0, 0, 1, 1};

        // Вызов методов
        System.out.println("Задание №1");
        arrReplacement(arr);
        System.out.println("Задание №2");
        arr100();
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
        }
        System.out.println();
    }
}
