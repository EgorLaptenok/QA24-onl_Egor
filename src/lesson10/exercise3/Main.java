package lesson10.exercise3;

public class Main {
    public static void main(String[] args) {
        String str = "fffff ab f 1234 jkjk";
        printWordMinChars(str);
    }

    public static int countChar(String str) {
        int chars = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                chars++;
            }
        }
        return chars;
    }

    public static void printWordMinChars(String str) {
        String[] words = str.split(" ");
        String minWord = words[0];
        int minChars = countChar(words[0]);
        for (String word : words) {
            int uniqueChars = countChar(word);
            if (uniqueChars < minChars) {
                minWord = word;
                minChars = uniqueChars;
            }
        }
        System.out.println(minWord);
    }
}
