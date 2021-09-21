package ru.geekbrains.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        int a = 4, b = 7, c = 9, numb = 5;
        String str = "Строка для повтора";

        // Вызов методов
        System.out.println("Сумма чисел " + a + " и " + b + " в диапазоне 10-20(вкл.) - " + RangeSumTenTwenty(a,b));

        System.out.print("Число: " + a + " - ");
        PositiveOrNegative(a);

        System.out.println("Число " + a + " отрицательное? - " + Negative(a));

        RepeatSout(str,numb);

        System.out.println("Год: " + c + " - високосный - " + LeapYear(c));
    }

    // Метод №1
    public static boolean RangeSumTenTwenty(int a, int b) {
        if ((a+b > 10) && (a+b <=20)) {
            return true;
        } else {
            return false;
        }
    }

    // Метод №2

    public static void  PositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // Метод №3
    public static boolean Negative(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    // Метод №4
    public static void RepeatSout(String str, int numb) {
        for (int i = 0; i < numb; i++) {
            System.out.println(str);
        }
    }

    //Метод №5
    public static boolean LeapYear(int a) {
        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
