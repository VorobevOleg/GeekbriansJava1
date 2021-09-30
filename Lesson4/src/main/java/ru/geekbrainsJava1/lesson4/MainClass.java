package ru.geekbrainsJava1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char symb) {
        int checkBuferLine, checkBuferColumn, checkBuferDiagMain = 0, checkBuferDiagSide = 0;
        int checkBuferDiagMain1 = 0, checkBuferDiagMain2 = 0, checkBuferDiagSide1 = 0, checkBuferDiagSide2 = 0;
        // Проверка ...
        for (int i = 0; i < SIZE; i++) {
            checkBuferLine = 0;
            checkBuferColumn = 0;
            for (int j = 0; j < SIZE; j++) {
                if ((symb == map[i][j]) && ((symb == map[i][j+1]) || (symb == map[i][Math.abs(j-1)]))) {
                    checkBuferLine += 1;
                } else { checkBuferLine = 0; }
                if ((symb == map[j][i]) && ((symb == map[j+1][i]) || (symb == map[Math.abs(j-1)][i]))) {
                    checkBuferColumn += 1;
                } else { checkBuferColumn = 0; }
                if (symb == map[i][j] && i == j && ((symb == map[i+1][j+1]) || (symb == map[Math.abs(i-1)][Math.abs(j-1)]))) {
                    checkBuferDiagMain += 1;
                } else { checkBuferDiagMain = 0; }
                if ((symb == map[i][j]) && (i + j == SIZE - 1) && (symb == map[i+1][Math.abs(i-1)] ||
                   symb == map[Math.abs(i-1)][j+1])) {
                    checkBuferDiagSide += 1;
                } else { checkBuferDiagSide = 0; }
                if ((symb == map[i][j]) && (i + j == SIZE - 2)) {
                    checkBuferDiagSide1 += 1;
                }
                if ((symb == map[i][j]) && (i + j == SIZE)) {
                    checkBuferDiagSide2 += 1;
                }
                if ((symb == map[i][j]) && (j == i + 1)) {
                    checkBuferDiagMain1 += 1;
                }
                if ((symb == map[i][j]) && (i == j + 1)) {
                    checkBuferDiagMain2 += 1;
                }
                if ((checkBuferLine == DOTS_TO_WIN) || (checkBuferColumn == DOTS_TO_WIN) ||
                   (checkBuferDiagMain == DOTS_TO_WIN) || (checkBuferDiagSide == DOTS_TO_WIN) ||
                   (checkBuferDiagSide1 == DOTS_TO_WIN) || (checkBuferDiagSide2 == DOTS_TO_WIN) ||
                   (checkBuferDiagMain1 == DOTS_TO_WIN) || (checkBuferDiagMain2 == DOTS_TO_WIN)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE+1][SIZE+1];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
