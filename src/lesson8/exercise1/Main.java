package lesson8.exercise1;

public class Main {
    public static void main(String[] args) {
        Figures[] figures = new Figures[5];
        figures[0] = new Circle(5);
        figures[1] = new Triangle(5, 5, 5);
        figures[2] = new Rectangle(4, 3);
        figures[3] = new Rectangle(5, 5);
        figures[4] = new Circle(7);
        double sumPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            sumPerimeter+=figures[i].perimeter();
        }
        System.out.println(sumPerimeter);
    }
}

//1. Написать иерархию классов «Фигуры».
//Фигура -> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве.