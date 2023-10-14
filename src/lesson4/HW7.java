package lesson4;

import java.util.Arrays;

public class HW7 {
    //6. Создайте массив строк. Заполните его произвольными именами людей.
    //Отсортируйте массив.
    //Результат выведите на консоль.

    public static void sortName(){
        String[] names = {"Пётр","Катя","Егор","Стас","Юля","Таня","Паша","Даша","Саша","Алексей","Настя",};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
