package lesson2;

import java.util.Scanner;

public class HW3 {

    //3. Напишите программу, которая будет принимать на вход число и на
    //выход будет выводить сообщение четное число или нет.
    //Для определения четности числа используйте операцию получения
    //остатка от деления - операция выглядит так: '% 2').

    static Scanner scanner = new Scanner(System.in);

    public static void evenOrOddNumber() {

        System.out.println("Ведите целое число");
        int a = scanner.nextInt();
        if ((a % 2) == 0) {
            System.out.println("Четное число");
        } else if ((a % 2) == 1) {
            System.out.println("Не четное число");
        } else {
            System.out.println("Это не число");
        }
    }
}