package lesson7.exercise1;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone("+375 29 799 55 44", "s23", 110.5);
        Phone sony = new Phone("+375 29 500 66 55", "x7");
        Phone google = new Phone();
        System.out.println(samsung.getNumber());
        System.out.println(sony.getNumber());
        System.out.println(google.getNumber());
        samsung.receiveCall("Tom");
        samsung.receiveCall("Maks", "+375 29 007 23 32");
        sony.receiveCall("Dora");
        sony.receiveCall("Masha", "+375 25 343 28 72");
        google.receiveCall("Tor");
        samsung.sendMessage("+375 29 800 80 04");
        sony.sendMessage("+375 25 303 03 30", "+375 29 505 44 54");
        google.sendMessage("+375 29 084 33 29", "+375 25 305 83 03", "+375 29 788 78 92");
    }
}

//Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и
//weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
//звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
//возвращает номер телефона. Вызвать эти методы для каждого из
//объектов.
//Добавить конструктор в класс Phone, который принимает на вход три
//параметра для инициализации переменных класса - number, model и
//weight.
//Добавить конструктор, который принимает на вход два параметра для
//инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
//Добавьте перегруженный метод receiveCall, который принимает два
//параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//метод.
//Создать метод sendMessage с аргументами переменной длины. Данный
//метод принимает на вход номера телефонов, которым будет отправлено
//сообщение. Метод выводит на консоль номера этих телефонов.
