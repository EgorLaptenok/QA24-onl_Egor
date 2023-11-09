package lesson8.exercise2;

public class Worker extends Employee {
    public Worker(String name) {
        super(name);
        this.post = "Рабочий";
    }

    @Override
    public void print() {
        System.out.println("Должность: " + post + "\nИмя: " + name);
    }
}
