package lesson5;

import java.util.Arrays;

public class HW5 {
    //Создайте двумерный массив. Выведите на консоль диагонали массива.

    public static void diagonal() {

        int[][] arr = {{5, 4, 4, 7, 2}, {8, 1, 9, 9, 3}, {7, 5, 6, 3, 1}, {4, 3, 2, 1, 8}, {6, 3, 7, 9, 8}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != j && arr.length - i - 1 != j) {
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println("_________________________________");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

