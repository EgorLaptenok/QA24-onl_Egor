package lesson9.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите логин:");
        String login = scanner.nextLine();
        System.out.println("Ведите пароль:");
        String password = scanner.nextLine();
        System.out.println("Ведите повторно пароль:");
        String confirmPassword = scanner.nextLine();
        try {
            System.out.println(CheckingLoginAndPassword.check(login, password, confirmPassword));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
        }
    }
}
// Создать класс, в котором будет статический метод.
//(почитать и понять, чем статический метод отличается от нестатического
//- обсудить на занятии по необходимости)
//Этот метод принимает на вход три параметра:
//Login,
//Password,
//confirmPassword.
//Все поля имеют тип данных String.
//Длина login должна быть меньше 20 символов и не должен содержать
//пробелы.
//Если login не соответствует этим требованиям, необходимо выбросить
//WrongLoginException.
//Длина password должна быть меньше 20 символов, не должен
//содержать пробелом и должен содержать хотя бы одну цифру.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо
//выбросить WrongPasswordException.
//WrongPasswordException и WrongLoginException - пользовательские
//классы исключения с двумя конструкторами – один по умолчанию,
//второй принимает сообщение исключения и передает его в конструктор
//класса Exception.
//Метод возвращает true, если значения верны или false в другом случае.
