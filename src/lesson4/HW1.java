package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
    //0. Создайте массив целых чисел. Напишете программу, которая выводит
    //сообщение о том, входит ли заданное число в массив или нет.
    //Пусть число для поиска задается с консоли (класс Scanner).
    static Scanner scanner = new Scanner(System.in);

    public static void arrIntegers() {
        int[] a = {1, 3, 5, 7, 9, 11};
        System.out.println("Ведите число:");
        int b = scanner.nextInt();
        boolean check = false;
        String v = " ";
        for (int j : a) {
            if (b == j) {
                check = true;
            }
            if (check) {
                v = "Ваше число есть в массиве: " + b + "\n Масив:" + Arrays.toString(a);
            } else {
                v = "Такого числа нет в массиве: " + b;

            }
        }
        System.out.println(v);
    }

}
