package lesson8.exercise1;

public class Rectangle implements Figures {
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
