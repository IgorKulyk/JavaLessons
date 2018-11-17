package Lesson6;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сумма = " + Summ(5, 5));
        System.out.println("Разница = " + Minus(9, 3));
        System.out.println("Произведение = " + Multiply(2, 2));
    }

    static int Summ(int x1, int x2) {
        int s = 0;
        s = x1 + x2;
        return s;
    }

    static int Minus(int x1, int x2) {
        int mi = 0;
        mi = x1 - x2;
        return mi;
    }

    static int Multiply(int x1, int x2) {
        int mu = 0;
        mu = x1 * x2;
        return mu;
    }
}

