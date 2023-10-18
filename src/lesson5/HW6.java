package lesson5;

import java.util.Arrays;
import java.util.Random;

public class HW6 {
    //Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
    //двумерного массива по возрастанию.
    public static final Random random = new Random();
    public static void twoArr(){
        int[][] arr =new int[3][3];
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int[] bud = new int[9];
        int count = 0;
        for(int[] one : arr){
            for(int two:one){
                bud[count++]=two;
            }
        }
        Arrays.sort(bud);
        int index = 0;
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=bud[index++];
            }
        }
        System.out.println("___________");
        System.out.println(Arrays.deepToString(arr));
    }
}
