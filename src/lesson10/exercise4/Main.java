package lesson10.exercise4;

public class Main {
    public static void main(String[] args) {
        String input = "Шла Саша по лесу и упал на шалаш";
        int wordIndex = 8;
        String[] words = input.split(" ");
        if (wordIndex > 0 && wordIndex <= words.length) {
            String word = words[wordIndex - 1];
            String reversed = "";
            for (int i = word.length(); i > 0; i--) {
                reversed += word.charAt(i - 1);
            }
            if (word.equals(reversed)) {
                System.out.println("Слово: " + word + " является палиндромом");
            } else {
                System.out.println("Слово: " + word + " не является палиндромом");
            }
        } else {
            System.out.println("Номер слово должен быть от 1 до " + words.length);
        }

    }
}
