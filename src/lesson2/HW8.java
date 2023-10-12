package lesson2;

import java.util.Scanner;

public class HW8 {
    //3. Напишите программу, где пользователь вводит любое целое
    //положительное число. А программа суммирует все числа от 1 до
    //введенного пользователем числа.
    //Для ввода числа воспользуйтесь классом Scanner.
    static Scanner scanner = new Scanner(System.in);

    public static void sum() {
        System.out.println("Ведите число");
        int b = scanner.nextInt();
        int a = 0;
        for (int i = 1; i <= b; i++) {
            a += i;

        }
        System.out.println(a);
    }
}