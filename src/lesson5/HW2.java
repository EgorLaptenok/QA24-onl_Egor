package lesson5;

public class HW2 {
    // Шахматная доска
    //Создать программу для раскраски шахматной доски с помощью цикла.
    //Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
    //циклам значения B(Black) или W(White). Результат работы программы:
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W

    public static void chess(){
        String[][] arr = new String[8][8];
        String white , black;
        white = "W";
        black = "B";
        for(int i=0;i<8;i++){
            if(i%2==0){
                for (int j=0;j<8;j++){
                    if(j%2==0){
                        arr[i][j]= white;
                    }else{
                        arr[i][j]= black;
                    }
                }
            }else{
                for (int j=0;j<8;j++){
                    if(j%2==1){
                        arr[i][j]= white;
                    }else{
                        arr[i][j]= black;
                    }
                }
            }
        }
        for (int i =0;i<8;i++){
            System.out.println(" ");
            for (int j = 0; j<8;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
