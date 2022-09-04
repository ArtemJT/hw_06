package ua.ithillel.artem_kovalov;

import java.time.LocalDate;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareSum(8, 15));
        checkNumber(4);
        System.out.println(isNegative(-5));
        printString("STRING", 4);
        System.out.println(isLeapYear());
    }

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        int a = 1;
        int b = 2;
        String result = (a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }

    static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 5;
        int b = 7;
        String result = a >= b ? "a >= b" : "a < b";
        System.out.println(result);
    }

    static boolean compareSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void checkNumber(int a) {
        String result = a >= 0 ? "Положительное" : "Отрицательное";
        System.out.println(result);
    }

    static boolean isNegative(int a) {
        return a < 0;
    }

    static void printString(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " " + str);
        }
    }

    static boolean isLeapYear() {
        int year = LocalDate.now().getYear();
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}