package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HW2 {
    //1. Создайте массив целых чисел. Удалите все вхождения заданного
    //числа из массива.
    //Пусть число задается с консоли (класс Scanner). Если такого числа нет -
    //выведите сообщения об этом.
    //В результате должен быть новый массив без указанного числа.
    static Scanner scanner = new Scanner(System.in);

    public static void deleteArr() {
        int[] a = {2, 4, 5, 6, 9, 11, 2};
        System.out.println("Выбирите элемен который хотите удалить из массива: " + Arrays.toString(a));
        int b = scanner.nextInt();
        int[] c = new int[a.length];
        String v = " ";
        int h = 0;
        int[] x = new int[0];
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                check = true;
            } else {
                c[h] = a[i];
                h++;
            }
            if (check) {
                v = "Мы удаляем число: " + b;
                x = Arrays.copyOf(c, h);
            } else {
                v = "Такого числа нет в массиве";
            }
        }
        System.out.println(v);
        System.out.println("Ваш новый массив: " + Arrays.toString(x));
    }
}
