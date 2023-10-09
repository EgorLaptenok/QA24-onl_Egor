package lesson2;

public class HW12 {
    //1. Выведите на экран первые 11 членов последовательности Фибоначчи.

    static public void fibonacci() {
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.println(a + "\n" + b);
        for (int i = 3; i <= 11; i++) {
            c = (a + b);
            a = b;
            b = c;

            System.out.println(c);
        }

    }
}