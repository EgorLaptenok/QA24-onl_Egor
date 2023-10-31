package lesson8.exercise1;

public class Triangle implements Figures {
    private double sidesOfTheTriangleA, sidesOfTheTriangleB, sidesOfTheTriangleC;

    public double getSidesOfTheTriangleA() {
        return sidesOfTheTriangleA;
    }

    public void setSidesOfTheTriangleA(double sidesOfTheTriangleA) {
        this.sidesOfTheTriangleA = sidesOfTheTriangleA;
    }

    public double getSidesOfTheTriangleB() {
        return sidesOfTheTriangleB;
    }

    public void setSidesOfTheTriangleB(double sidesOfTheTriangleB) {
        this.sidesOfTheTriangleB = sidesOfTheTriangleB;
    }

    public double getSidesOfTheTriangleC() {
        return sidesOfTheTriangleC;
    }

    public void setSidesOfTheTriangleC(double sidesOfTheTriangleC) {
        this.sidesOfTheTriangleC = sidesOfTheTriangleC;
    }

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
