package lesson6.exercise2;

public class RAM {
    String name;
    int memory;

    public RAM() {
        name = "HongKongUnderground";
        memory = 2;
    }

    public RAM(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    public String info() {
        return "Название: " + name + "\n Память: " + memory + "ГБ";
    }
}
