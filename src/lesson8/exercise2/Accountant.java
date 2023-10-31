package lesson8.exercise2;

public class Accountant implements WorkingStaff {
    private String post;
    private String name;

    public Accountant(String name) {
        this.post = "Бухгалтер";
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Должность: " + post + "\nИмя: " + name);
    }
}
