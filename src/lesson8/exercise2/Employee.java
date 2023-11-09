package lesson8.exercise2;

public class Employee implements WorkingStaff {
    protected String post;
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void print() {

    }
}
