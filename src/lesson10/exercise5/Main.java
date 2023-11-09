package lesson10.exercise5;

public class Main {
    public static void main(String[] args) {
        String input = "Hello";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            output = output + c + c;
        }
        System.out.println(output);
    }
}
