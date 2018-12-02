package Lesson9.Task7;

/*Создать класс “Figure” с тремя вещественными показателями для длины, ширины и высоты фигуры.
Создать три конструктора, которые принимают от одного до трех указанных выше параметров для
создания объектов класса, представляющих соответственно прямую, прямоугольник и параллелепипед.
Добавить в класс функцию для вывода типа фигуры в соответствии с определенными в конструкторе
параметрами.*/
public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure(4,8,15);
        figure.detectFigure(figure);
    }
}

class Figure {
    private int length;
    private int width;
    private int height;
    private String type;

    public Figure(int length) {
        this.length = length;
        this.width = 0;
        this.height = 0;
        this.type = "Line";
    }

    public Figure(int length, int width) {
        this.length = length;
        this.width = width;
        this.height = 0;
        this.type = "Rectangle";
    }

    public Figure(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.type = "Parallelogram";
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void detectFigure(Figure figure){
        System.out.println(getType());
    }
}