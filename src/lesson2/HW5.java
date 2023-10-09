package lesson2;

import java.util.Scanner;

public class HW5 {
    //5. По введенному номеру определить цвет радуги (1 –
    //красный, 4 – зеленый и т. д.).
    static Scanner scanner = new Scanner(System.in);

    static public void rainbow() {
        System.out.println("Ведите число что-бы получить цвет радуги");
        String color = "";
        switch (scanner.nextInt()) {
            case 1:
                color = "Red";
                break;
            case 2:
                color = "Orange";
                break;
            case 3:
                color = "Green";
                break;
            case 4:
                color = "Blue";
                break;
            case 6:
                color = "Indigo";
                break;
            case 7:
                color = "Violet";
                break;
            default:
                System.out.println("Не верное число");
                color = "Not found";

        }
        System.out.println("Цвет радуги: " + color);
    }
}