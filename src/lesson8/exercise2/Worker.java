package lesson8.exercise2;

public class Worker implements WorkingStaff {
    private String post;
    private String name;

    public Worker(String name) {
        this.post = "Рабочий";
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Должность: " + post + "\nИмя: " + name);
    }
}
