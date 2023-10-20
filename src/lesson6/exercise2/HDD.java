package lesson6.exercise2;

public class HDD {
    String name;
    int memory;
    String type;

    public HDD() {
        name = "ChineTown";
        memory = 128;
        type = "Inner";
    }

    public HDD(String name, String type, int memory) {
        this.name = name;
        this.type = type;
        this.memory = memory;
    }

    public String info() {
        return "Название: " + name + "\n Память: " + memory + "ГБ" + "\n Тип: " + type;
    }
}
