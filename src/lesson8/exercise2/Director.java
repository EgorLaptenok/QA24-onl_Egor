package lesson8.exercise2;

public class Director extends Employee {
    public Director(String name) {
        super(name);
        this.post = "Директор";
    }

    @Override
    public void print() {
        System.out.println("Должность: " + post + "\nИмя: " + name);
    }
}
