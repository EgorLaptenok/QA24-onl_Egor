package lesson8.exercise1;

public class Rectangle extends Figures {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return (width * height) * 2;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public void info() {
        System.out.println("Периметр:" + perimeter() + "\nПлощадь" + area());
    }
}
