package lesson2;

public class HW10 {
    //5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..

    public static void negativeNumbers() {
        int a = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            a -= 5;

        }
    }
}