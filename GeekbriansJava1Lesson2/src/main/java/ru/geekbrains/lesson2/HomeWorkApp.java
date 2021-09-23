package ru.geekbrains.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        int a = 4, b = 7, year = 2000, numb = 5;
        String str = "Строка для повтора";

        // Вызов методов
        System.out.println("Сумма чисел " + a + " и " + b + " в диапазоне 10-20(вкл.) - " + RangeSumTenTwenty(a,b));

        System.out.print("Число: " + a + " - ");
        PositiveOrNegative(a);

        System.out.println("Число " + a + " отрицательное? - " + Negative(a));

        RepeatSout(str,numb);

        System.out.println("Год: " + year + " - високосный - " + LeapYear(year));
    }

    // Метод №1
    public static boolean RangeSumTenTwenty(int a, int b) {
        return ((a+b > 10) && (a+b <= 20));
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
        return (a >= 0);
    }

    // Метод №4
    public static void RepeatSout(String str, int numb) {
        for (int i = 0; i < numb; i++) {
            System.out.println(str);
        }
    }

    //Метод №5
    public static boolean LeapYear(int a) {
        return (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0));
    }

}
