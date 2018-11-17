package Lesson3;

public class Task8 {
    public static void main(String[] args) {

        double max = -10;
        double i = Math.pow(Math.E, max);
        for (double x = -10; x <= 10; x += 0.01) {
            if (Math.pow(Math.E,x) > Math.pow(Math.E,max)) {
                max = x;
                i = Math.pow(Math.E,x);
            }

        }
        System.out.println("x = " + max);
        System.out.println("func = " + i);
    }
}
