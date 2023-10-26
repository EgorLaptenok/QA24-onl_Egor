package lesson6.exercise1;

public class Main {
    public static void main(String[] args) {
        CreditCard[] cardsArray = new CreditCard[3];
        for (int i = 0; i < cardsArray.length; i++) {
            cardsArray[i] = new CreditCard("3000" + (i + 1), (i + 1) * 350);
            System.out.println(cardsArray[i].info());
        }
        for (int i = 0; i < cardsArray.length; i++) {
            System.out.println(cardsArray[i].info3());
        }
    }
}
//1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную
//карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую
//сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у
//которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.
