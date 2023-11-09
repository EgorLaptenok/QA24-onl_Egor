package lesson10.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ведите сторку формате: \"xxxx-yyy-xxxx-yyy-xyxy\"");
        System.out.println("где x — это число, а y — это буква");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        if (in != null && in.matches("\\d{4}-\\w{3}-\\d{4}-\\w{3}-\\w{4}")) {
            printTwoBlock(in);
            printStar(in);
            printOnlyLatter(in);
            checkABC(in);
            startWith(in);
            endWith(in);
        } else {
            System.err.println("NullPoint");
        }
    }

    public static void printTwoBlock(String block) {
        String[] blocks = block.split("-");
        System.out.println(blocks[0] + "-" + blocks[2]);
    }

    public static void printStar(String star) {
        String stringStar = star.replaceAll("(?<=-)[a-zA-z]{3}(?=-)", "***");
        System.out.println(stringStar);
    }

    public static void printOnlyLatter(String latter) {
        String onlyLatter = latter.replaceAll("[\\d-]", "");
        onlyLatter = onlyLatter.toLowerCase();
        onlyLatter = String.format("%s/%s/%s/%s", onlyLatter.substring(0, 3), onlyLatter.substring(3, 6), onlyLatter.charAt(6), onlyLatter.charAt(7));
        System.out.println(onlyLatter);
        onlyLatter = onlyLatter.toUpperCase();
        System.out.println(onlyLatter);
    }

    public static void checkABC(String abc) {
        abc = abc.toLowerCase();
        boolean containsABC = abc.contains("abc");
        if (containsABC) {
            System.out.println("Содержит последовательность \"abc\"");
        } else {
            System.out.println("Не содержит последовательность \"abc\"");
        }
    }

    public static void startWith(String start) {
        boolean startWith = start.startsWith("555");
        if (startWith) {
            System.out.println("Начинается \"555\"");
        } else {
            System.out.println("Не начинается \"555\"");
        }
    }

    public static void endWith(String end) {
        boolean endWith = end.endsWith("1a2b");
        if (endWith) {
            System.out.println("Заканчивается на \"1a2b\"");
        } else {
            System.out.println("Не заканчивается на \"1a2b\"");
        }
    }
}
