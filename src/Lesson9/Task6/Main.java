package Lesson9.Task6;

/*Создать класс ”Function” c четырьмя вещественными показателями для коэффициентов при каждом
члене в формуле x3+x2+x+c, также создать функцию, принимающую на вход показатель x и выводящую
значение функции в соответствующей x точке. Добавить в класс конструктор с параметрами, функцию для
вывода формулы с добавленными в нее параметрами.*/
public class Main {
    public static void main(String[] args) {
        Function function = new Function(4.1, 5.3, 6.8, 1.9);
        function.calcFunction(3.2);
    }
}

class Function {
    private double a;
    private double b;
    private double c;
    private double d;

    public Function(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void calcFunction(double x) {
        double res; //(a*x)^3+(b*x)^2+(d*x)+c
        res = Math.pow((getA() * x), 3) + Math.pow((getB() * x), 2) + (getD() * x) + getC();
        System.out.println("X = " + x);
        System.out.println("Your function is:");
        System.out.println("(" + getA() + "*" + x + ")^3 + " + "(" + getB() + "*" + x + ")^2 + " + "(" +
                getD() + "*" + x + ") + " + getC());
        System.out.println("Calculation result = " + res);

    }


}
