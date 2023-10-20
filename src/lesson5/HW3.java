package lesson5;

import java.util.Arrays;

public class HW3 {
    //Умножение двух матриц
    //Создайте два массива целых чисел размером 3х3 (две матрицы).
    //Напишите программу для умножения двух матриц.
    //Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
    //Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
    //Ожидаемый результат: 1 2 3 1 1 1 0 0 0

    public static void twoArr() {
        int[][] a = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] b = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        System.out.println(Arrays.deepToString(a));
        System.out.println("___________________________");
        System.out.println(Arrays.deepToString(b));
        System.out.println("_____________________________");
        int count = 0;
        for (int[] c : a) {
            count += c.length;
        }
        int[] buf = new int[count];
        int count1 = 0;
        for (int[] one : a) {
            for (int d : one) {
                buf[count1++] = d;
            }
        }
        int count2 = 0;
        for (int[] c2 : b) {
            count2 += c2.length;
        }
        int[] buf2 = new int[count2];
        int count3 = 0;
        for (int[] two : b) {
            for (int b2 : two) {
                buf2[count3++] = b2;
            }
        }
        System.out.println("Первая матрица:" + Arrays.toString(buf));
        System.out.println("________________________________________________");
        System.out.println("Вторая матрица:" + Arrays.toString(buf2));
        int[] fin = new int[count2];
        System.out.println("___________________________");
        for (int i = 0; i < fin.length; i++) {
            if (buf[i] == 0) {
                fin[i] = buf2[i];
            } else if (buf2[i] == 0) {
                fin[i] = buf[i];
            } else {
                fin[i] = buf[i] * buf2[i];
            }
            System.out.print(fin[i] + " ");
        }
        System.out.println(" ");
        System.out.println("________________________________________________");
        System.out.println("Итог умножения двух матриц" + Arrays.toString(fin));
    }
}
