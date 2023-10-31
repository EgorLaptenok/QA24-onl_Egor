package lesson8.exercise2;

public class Accountant extends Employee {
    public Accountant(String name) {
        super(name);
        this.post = "Бухгалтер";
    }

    @Override
    public void print() {
        System.out.println("Должность: " + post + "\nИмя: " + name);
    }
}
