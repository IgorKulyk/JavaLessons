package Lesson9.Task8;

/*Создать класс “Polynomial” с шестью вещественными показателями для коэффициентов при каждом
члене в формуле x5+ x4+x3+x2+x+c. Добавить в класс функции для расчета значения полинома в
указанной точке x, а также значения производной, также в указанной точке x.*/
public class Main {
    public static void main(String[] args) {
        Polynominal poly = new Polynominal(2,5.4,9.1,4.5,6,8.8);
        poly.calcPolynom(6);
    }
}

class Polynominal {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public Polynominal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public void calcPolynom(double x) {
        double res; //(a*x)^5 + (b*x)^4 + (d*x)^3 + (e*x)^2 + (f*x) + c
        res = Math.pow((getA() * x), 5) + Math.pow((getB() * x), 4) + Math.pow((getD() * x), 3)
                + Math.pow((getE() * x), 2) + (getF() * x) + getC();
        System.out.println("X = " + x);
        System.out.println("Your function is:");
        System.out.println("(" + getA() + "*" + x + ")^5 + " + "(" + getB() + "*" + x + ")^4 + " + "(" + getD() +
                "*" + x + ")^3 + " + "(" + getE() + "*" + x + ")^2 + " + "(" + getF() + "*" + x + ") + " + getC());
        System.out.println("Calculation result = " + res);

    }
}