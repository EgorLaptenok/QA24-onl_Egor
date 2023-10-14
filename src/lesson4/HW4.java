package lesson4;

import java.util.Arrays;

public class HW4 {
    //3. Создайте 2 массива из 5 чисел.
    //Выведите массивы на консоль в двух отдельных строках.
    //Посчитайте среднее арифметическое элементов каждого массива и
    //сообщите, для какого из массивов это значение оказалось больше (либо
    //сообщите, что их средние арифметические равны).

    public static void twoArr() {
        int[] a = {82, 15, 45, 36, 67};
        int[] b = {49, 75, 76, 48, 22};
        System.out.println("Первый массив: " + Arrays.toString(a));
        System.out.println("Второй массив: " + Arrays.toString(b));
        int sumA = 0;
        int sumB = 0;
        String win = " ";
        for (int numA : a) {
            sumA += numA;
        }

        double avgA = (double) sumA / a.length;

        for (int numB : b) {
            sumB += numB;
        }

        double avgB = (double) sumB / b.length;

        if (avgA > avgB) {
            win = "Первый массив больше, его средние арифметическое значение: " + avgA + "\nСредние арифметическое значение второго: " + avgB;
        } else if (avgB > avgA) {
            win = "Второй массив больше, его средние арифметическое значение: " + avgB + "\nСредние арифметическое значение первого: " + avgA;
        } else {
            win = "Одинаковое значение,средние арифметическое значение первого массива:  " + avgA + "\nСредние арифметическое значение второго: " + avgB;
        }
        System.out.println(win);
    }
}
