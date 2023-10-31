package lesson8.exercise1;

public class Circle implements Figures {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void info() {
        System.out.println("Периметр:" + perimeter() + "\nПлощадь" + area());
    }
}
