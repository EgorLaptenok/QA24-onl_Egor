package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    //2. Создайте и заполните массив случайным числами и выведете
    //максимальное, минимальное и среднее значение.
    //Для генерации случайного числа используйте метод Math.random().
    //Пусть будет возможность создавать массив произвольного размера.
    //Пусть размер массива вводится с консоли.
    static Scanner scanner = new Scanner(System.in);

    public static void sizeArr() {
        System.out.println("Ведите размер массива");
        int[] a = new int[scanner.nextInt()];

        for (int i = 0; i < a.length; i++) {
            double b = Math.random() * 100;
            int random = (int) b;
            a[i] = random;
        }
        System.out.println("Ваш новый массив: " + Arrays.toString(a));

        int max = a[0];
        int min = a[0];
        int sum = 0;

        for (int num : a) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }
        double avg = (double) sum / a.length;
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Средние значение: " + avg);
    }
}
