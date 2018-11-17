package Lesson3;

public class Task5 {
    public static void main(String[] args) {

        double max = -50;
        double i = Math.pow(max,3);
        for (double x = -50; x <= 50 ; x+=0.01) {
            if (Math.pow(x, 3) > Math.pow(max, 3)){
                max = x;
                i = Math.pow(x, 3);
            }

        }
        System.out.println("x = " + max);
        System.out.println("func = " + i);
    }
}
