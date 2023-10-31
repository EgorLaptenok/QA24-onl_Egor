package lesson8.exercise2;

public class Director implements WorkingStaff {
    private String post;
    private String name;

    public Director(String name) {
        this.post = "Директор";
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Должность: " + post + "\nИмя: " + name);
    }
}
