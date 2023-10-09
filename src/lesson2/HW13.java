package lesson2;

import java.util.Scanner;

public class HW13 {
    //2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    //Напишите программу, в которую пользователь вводит сумму вклада и
    //количество месяцев. А банк вычисляет конечную сумму вклада с учетом
    //начисления процентов за каждый месяц.
    //Для вычисления суммы с учетом процентов используйте цикл for. Пусть
    //сумма вклада будет представлять тип float.
    static Scanner scanner = new Scanner(System.in);

    public static void bank() {
        System.out.println("Ведите сумму");
        float sum = scanner.nextFloat();
        System.out.println("Ведите кол-во месяцов");
        float sumBank = 0.0f;
        int month = scanner.nextInt();
        for (int i = 0; i < month; i++) {
            sumBank = (sum / 100) * 7;
            sum += sumBank;

        }
        System.out.println("Ваша сумма по окончанию вклада: " + sum);
    }
}