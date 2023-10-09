package lesson2;

import java.util.Scanner;

public class HW2 {
    //2. Написать программу для вывода названия поры года по номеру
    //месяца.
    //При решении используйте оператор if-else-if.
    static Scanner scanner = new Scanner(System.in);

    public static void seasonTwo() {
        String season = "";
        System.out.println("Ведите число месяца что-бы увитеь пору года:");
        int a = scanner.nextInt();
        if (a <= 2 || a == 12) {
            season = "Зима";
        } else if (a <= 5) {
            season = "Весна";
        } else if (a <= 8) {
            season = "Лето";
        } else if (a <= 11) {
            season = "Осень";
        } else {
            System.out.println("Неверное число");
            season = "Not Found";
        }
        System.out.println("Пора года " + season);
    }
}
