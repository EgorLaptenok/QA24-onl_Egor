package lesson5;


import java.util.Arrays;
import java.util.Scanner;

public class Practic {
    static Scanner scanner = new Scanner(System.in);

    public static void revers() {
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double random = Math.random() * 100;
                int r = (int) random;
                arr[i][j] = r;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, c = m - 1; j < arr[i].length / 2; j++, c--) {
                int b = arr[i][j];
                arr[i][j] = arr[i][c];
                arr[i][c] = b;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\n" + Arrays.toString(arr[i]));
        }
    }
}
