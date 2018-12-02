package Lesson9.Task1;

import java.util.Scanner;

/*Создать класс “Point” с двумя вещественными переменными для определения координат точки по x и
y. Добавить в класс конструктор с параметрами, две функции для возвращения значений координат x и y
соответственно, а также функцию, в которую передаются координаты другой точки, после чего в ней
рассчитывается расстояние до нее и выводится на экран.*/
public class Main {
    public static void main(String[] args) {
        Point pointOne = new Point();
        Point pointTwo = new Point();
        pointOne.scanXY();
        pointOne.printXY();
        pointTwo.scanXY();
        pointTwo.printXY();
        Point.findDistance(pointOne, pointTwo);
    }
}

class Point {
    private double x;
    private double y;

    public Point() {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void scanXY() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x coordinates");
        this.setX(scanner.nextDouble());
        System.out.println("Enter y coordinates");
        this.setY(scanner.nextDouble());
    }

    public void printXY() {
        System.out.print("Coordinates of your point is: " + this.getX());
        System.out.println("|" + this.getY());
    }

    public static void findDistance(Point pointOne, Point pointTwo) {
        double dist = 0;
        double ac = 0;
        double bc = 0;
        ac = Math.pow((pointTwo.getX() - pointOne.getX()), 2);
        bc = Math.pow((pointTwo.getY() - pointOne.getY()), 2);
        dist = Math.sqrt(ac + bc);
        System.out.println("Distance from first point to second is: " + dist);
    }
}
