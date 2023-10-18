package lesson4;

import java.util.Arrays;

public class HW6 {
    //5. Создайте массив и заполните массив.
    //Выведите массив на экран в строку.
    //Замените каждый элемент с нечётным индексом на ноль.
    //Снова выведете массив на экран на отдельной строке.

    public static void oddNumbers(){
        int[] arr = new int[6];
        for(int i = 0; i<5; i++){
            double random = Math.random()*100;
            arr[i] = (int) random;
        }
        System.out.println("Ваш массив: "+ Arrays.toString(arr));

        for(int i = 0;i<arr.length; i++){
            if(i%2==1){
                arr[i]=0;
            }
        }
        System.out.println("_______________________________");
        System.out.println("Наш массив где мы в каждый элемент заменили на ноль с нечётным индексом \n"+Arrays.toString(arr));
    }
}
