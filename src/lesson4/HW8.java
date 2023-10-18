package lesson4;

import java.util.Arrays;

public class HW8 {
    //7.Реализуйте алгоритм сортировки пузырьком.

    public static void bubble(){
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            double random =Math.random()*100;
            arr[i]=(int) random;
        }
        System.out.println("Наш массив: "+ Arrays.toString(arr));
        System.out.println("___________________________________");
        int a = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr.length -1 -i; j++){
                if(arr[j]>arr[j+1]){
                    a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=a;
                }
            }
        }
        System.out.println("Теперь наш массив отсортированный: "+Arrays.toString(arr));
    }
}
