package lesson8.exercise1;

public class Triangle extends Figures {
    private double sidesOfTheTriangleA, sidesOfTheTriangleB, sidesOfTheTriangleC;

    public Triangle(double sidesOfTheTriangleA, double sidesOfTheTriangleB, double sidesOfTheTriangleC) {
        this.sidesOfTheTriangleA = sidesOfTheTriangleA;
        this.sidesOfTheTriangleB = sidesOfTheTriangleB;
        this.sidesOfTheTriangleC = sidesOfTheTriangleC;
    }

    @Override
    public double perimeter() {
        return sidesOfTheTriangleA + sidesOfTheTriangleB + sidesOfTheTriangleC;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - sidesOfTheTriangleA) * (s - sidesOfTheTriangleB) * (s - sidesOfTheTriangleC));
    }

    @Override
    public void info() {
        System.out.println("Периметр:" + perimeter() + "\nПлощадь" + area());
    }
}
