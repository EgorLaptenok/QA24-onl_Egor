package lesson8.exercise2;

public class Main {
    public static void main(String[] args) {
        WorkingStaff[] workingStaffs= new WorkingStaff[5];
        workingStaffs[0] = new Director("Tom");
        workingStaffs[1] = new Worker("Dima");
        workingStaffs[2] = new Worker("Masha");
        workingStaffs[3] = new Worker("Sasha");
        workingStaffs[4] = new Accountant("Dora");
        for (int i = 0; i < workingStaffs.length; i++) {
            workingStaffs[i].print();
            System.out.println(" ");
        }
    }
}
//Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название должности и
//имплементировать этот метод в созданные классы.