package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
    //0. Создать трехмерный массив из целых чисел.
    //С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
    //заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
    //задается из консоли.
    static Scanner scanner = new Scanner(System.in);

    public static void arrTd() {
        int[][][] arr = new int[3][3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    double random = Math.random() * 10;
                    arr[i][j][k] = (int) random;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print("[");
                for (int k = 0; k < 3; k++) {
                    System.out.print(" " + arr[i][j][k] + " ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
        System.out.println("Ведите число, на которое будет увеличиваться каждый элемент");
        int a = scanner.nextInt();
        System.out.println("___________________________");
        System.out.println("Теперь мы увеличим каждое число на: " + a);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] += a;
                }
            }
        }
        System.out.println("Ваш новый массив");
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            System.out.println(Arrays.deepToString(arr[i]));
        }
    }
}
