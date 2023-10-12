package lesson2;

import java.util.Scanner;

public class HW4 {
    //4. Для введенного числа t (температура на улице) вывести
    //Если t>–5, то вывести «Тепло».
    //Если –5>= t > –20, то вывести «Нормально».
    //Если –20>= t, то вывести «Холодно».
    static Scanner scanner = new Scanner(System.in);

    public static void thermometer() {
        int t = scanner.nextInt();
        System.out.println("Ведите темературу");
        String temperature = "";
        if (t > -5) {
            temperature = "Тепло";
        } else if (t > -20) {
            temperature = "Нормально";
        } else {
            temperature = "Холодно";
        }
        System.out.println("На улице: " + temperature);
    }
}