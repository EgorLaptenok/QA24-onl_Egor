package lesson6.exercise2;

public class Computer {
    double price;
    String model;
    HDD hdd;
    RAM ram;


    public Computer() {
        price = 799.99;
        model = "Horizons";
        hdd = new HDD();
        ram = new RAM();
    }

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.hdd = new HDD("Sony", "внутренняя память", 512);
        this.ram = new RAM("samsung", 16);
    }

    public void info() {
        System.out.println("price:" + price + "\nmodel:" + model + " \nHDD:\n" + hdd + "\nRAM:\n" + ram);
    }
}
