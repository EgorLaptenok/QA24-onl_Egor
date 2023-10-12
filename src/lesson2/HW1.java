package lesson2;

import java.util.Scanner;

public class HW1 {
    //1. Написать программу для вывода названия поры года по номеру
    //месяца.
    //При решении используйте оператор switch-case.
    static Scanner scanner = new Scanner(System.in);

    public static void seasonOne() {

        System.out.println("Ведите число месяца что-бы увитеь пору года:");
        String season = "";
        switch (scanner.nextInt()) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                System.out.println("Неверное число");
                season = "Not Found";

        }
        System.out.println("Пора года " + season);
    }
}
