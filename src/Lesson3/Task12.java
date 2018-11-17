package Lesson3;

public class Task12 {
    public static void main(String[] args) {

        double max = 0;
        double i = (Math.pow(max, Math.E) + Math.pow(max, 2));
        for (double x = 0; x < 5; x += 0.01) {
            if ((Math.pow(x, Math.E) + Math.pow(x, 2)) > (Math.pow(max, Math.E) + Math.pow(max, 2))) {
                max = x;
                i = (Math.pow(x, Math.E) + Math.pow(x, 2));
            }

        }
        System.out.println("x = " + max);
        System.out.println("func = " + i);
    }
}