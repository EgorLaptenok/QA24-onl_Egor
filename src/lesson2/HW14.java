package lesson2;

public class HW14 {
    //. Напишите программу, которая выводит на консоль таблицу
    //умножения.

    public static void table() {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("  ");
            for (int j = 1; j <= 10; j++) {
                a = i * j;
                System.out.print(a + " ");
            }
        }
    }
}
