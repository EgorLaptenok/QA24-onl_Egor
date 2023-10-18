package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HW5 {
    //4. Создайте массив из n случайных целых чисел и выведите его на экран.
    //Размер массива пусть задается с консоли и размер массива может быть
    //больше 5 и меньше или равно 10.
    //Если n не удовлетворяет условию - выведите сообщение об этом.
    //Если пользователь ввёл не подходящее число, то программа должна
    //просить пользователя повторить ввод.
    //Создайте второй массив только из чётных элементов первого массива,
    //если они там есть, и вывести его на экран.

    static Scanner scanner = new Scanner(System.in);

    public static void newArr() {

        boolean number = false;
        int b = 0;
        while (!number) {
            System.out.println("Ведите число, которое больше 5 и меньше или равно 10 для создания массива");
            b = scanner.nextInt();
            if (b <= 5 || b > 10) {
                System.out.println("Ваше число не удовлетворяет условию: " + b);
            } else {
                number = true;
            }
        }
        System.out.println("ваш массив будет состоять из [" + b + "] чисел");
        int[] a = new int[b];
        for (int i = 0; i < a.length; i++) {
            double c = Math.random() * 100;
            int cc = (int) c;
            a[i] = cc;
        }
        System.out.println("Ваш массив: " + Arrays.toString(a));
        System.out.println("Теперь мы уберём все нечётные числа с вашего массива");
        int count = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                count++;
            }
        }
        int[] copyA = new int[count];
        int j = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                copyA[j] = num;
                j++;
            }
        }
        System.out.println("Ваш новый массив только с чётными числами: " + Arrays.toString(copyA));
    }
}
