package Lesson3;

public class Task10 {
    public static void main(String[] args) {

        double max = 0;
        double i = Math.pow(max, Math.E);
        for (double x = 0; x <= 10; x += 0.01) {
            if (Math.pow(x, Math.E) > Math.pow(max, Math.E)) {
                max = x;
                i = Math.pow(x, Math.E);
            }

        }
        System.out.println("x = " + max);
        System.out.println("func = " + i);
    }
}
