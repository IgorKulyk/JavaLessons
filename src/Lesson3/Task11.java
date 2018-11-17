package Lesson3;

public class Task11 {
    public static void main(String[] args) {

        double max = 0;
        double i = (Math.pow(max, Math.E) + max);
        for (double x = 0; x < 5; x += 0.01) {
            if ((Math.pow(x, Math.E) + x) > (Math.pow(max, Math.E) + max)) {
                max = x;
                i = (Math.pow(x, Math.E) + x);
            }

        }
        System.out.println("x = " + max);
        System.out.println("func = " + i);
    }
}
