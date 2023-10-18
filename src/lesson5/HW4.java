package lesson5;

import java.util.Arrays;

public class HW4 {
    //Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
    //элементов массива.

    public static void arrTwoD(){
        int[][] arr = new int[3][3];
        int sum2 = 0;
        for(int i = 0; i<3;i++){
            for(int j = 0;j<3;j++){
                double random = Math.random()*10;
                arr[i][j] =(int) random;
                sum2+=arr[i][j];
            }
        }
        System.out.println("Наш массив: "+Arrays.deepToString(arr));
        int index = 0;
        for(int[]a:arr){
            index += a.length;
        }
        int[] two = new int[index];
        int count =0;
        for(int[] one: arr){
            for(int a : one){
                two[count++]=a;
            }
        }
        System.out.println("_______________________");
        System.out.println("Числа из нашего массива: "+Arrays.toString(two));
        int sum = 0;
        for (int i = 0;i<two.length;i++){
            sum+=two[i];
        }
        System.out.println("_______________________");
        System.out.println("Сумма всех чисел: "+sum);
        System.out.println("_______________________");
        System.out.println("Сумма всех чисел: "+sum2);
    }
}
