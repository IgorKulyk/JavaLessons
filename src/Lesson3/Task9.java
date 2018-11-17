package Lesson3;

public class Task9 {
    public static void main(String[] args) {

        double max = -100;
        double i = Math.pow(Math.E, Math.sin(max));
        for (double x = -100; x <= 100; x += 0.01) {
            if (Math.pow(Math.E, Math.sin(x)) > Math.pow(Math.E, Math.sin(max))) {
                max = x;
                i = Math.pow(Math.E, Math.sin(x));
            }

        }
        System.out.println("x = " + max);
        System.out.println("func = " + i);
    }
}
