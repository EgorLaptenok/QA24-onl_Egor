package lesson2;

public class HW6 {
    //1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.

    public static void oneHundred() {
        for (int i = 1; i < 100; i++) {
            if ((i % 2) == 1) {
                System.out.println(i);
            }
        }
    }
}
