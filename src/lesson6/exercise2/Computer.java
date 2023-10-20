package lesson6.exercise2;

public class Computer {
    double price;
    String model;
    HDD hdd = new HDD("Sony", "внутренняя память", 512);
    RAM ram = new RAM("samsung", 16);
    String HDD;
    String RAM;
    HDD hdd2 = new HDD();
    RAM ram2 = new RAM();

    public Computer() {
        price = 799.99;
        model = "Horizons";
        HDD = hdd2.info();
        RAM = ram2.info();
    }

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.HDD = hdd.info();
        this.RAM = ram.info();
    }

    public void info() {
        System.out.println("price:" + price + "\nmodel:" + model + " \nHDD:\n" + HDD + "\nRAM:\n" + RAM);
    }
}
