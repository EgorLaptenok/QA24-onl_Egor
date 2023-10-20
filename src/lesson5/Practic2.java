package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Practic2 {
    static Scanner scanner = new Scanner(System.in);

    public static void ultraArr(){
        System.out.println("Напишите вашу длину массиву");
        int a = scanner.nextInt();
        int[][] arr = new int[a][];
        for(int i = 0,j = 0; i<a;i++,j++){
            double random = Math.random()*10;
            int c =(int)random;
            arr[j] = new int[c];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                double random = Math.random() * 100;
                int r = (int) random;
                arr[i][j] = r;
            }
        }

        for (int i = 0; i < a; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, c = arr[i].length - 1; j < arr[i].length / 2; j++, c--) {
                if((i % 2) == 0) {
                    int b = arr[i][j];
                    arr[i][j] = arr[i][c];
                    arr[i][c] = b;
                }

            }
        }
        System.out.println("__________________________");
        for (int i = 0; i < a; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int l = 0;
        for(int[] count1: arr){
            l+=count1.length;
        }
        System.out.println("__________________________");
        System.out.println("Будущая длина одномерного массива:"+l);

        int[] newArr = new int[l];
        int count = 0;
        for(int[] n : arr){
            for(int v : n){
                newArr[count++]=v;
            }
        }

        System.out.println("__________________________");
        System.out.println(Arrays.toString(newArr));
    }
}
