package lesson10.exercise2;

public class Main {
    public static void main(String[] args) {
        String str = "Данная строка является последовательной длиной с произвольными словами";
        shortAndLongWords(str);
    }

    public static void shortAndLongWords(String str) {
        String[] words = str.split(" ");
        String shortWord = words[0];
        String longWord = words[0];
        int shortLength = words[0].length();
        int longLength = words[0].length();
        for (String word : words) {
            int length = word.length();
            if (length <= shortLength) {
                shortWord = word;
                shortLength = length;
            }
            if (length >= longLength) {
                longWord = word;
                longLength = length;
            }
        }
        System.out.println("Самое короткое слово: " + shortWord);
        System.out.println("Самое длинное слово: " + longWord);
    }
}
