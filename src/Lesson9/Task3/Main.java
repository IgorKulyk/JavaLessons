package Lesson9.Task3;

/*Создать класс “Triangle” с тремя вещественными переменными для задания длин его сторон.
Добавить в класс функции для расчета периметра, площади по формуле Герона, а также для определения
типа треугольника.*/
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.1, 6.4, 1.2);
        System.out.println("Triangle's perimeter = " + triangle.perimTriangle(triangle));
        System.out.println("Triangles square from Heron's formula = " + triangle.squareTriangle(triangle));


    }
}

class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double perimTriangle(Triangle triangle) {
        double p = 0;
        p = getA() + getB() + getC();
        return p;
    }

    public double squareTriangle(Triangle triangle) {
        double s = 0;
        double sp = perimTriangle(triangle) / 2;
        double aa = sp - getA();
        double bb = sp - getB();
        double cc = sp - getC();
        s = Math.sqrt(Math.abs(sp * aa * bb * cc));
        return s;
    }


}
