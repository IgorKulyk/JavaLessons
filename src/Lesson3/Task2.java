package Lesson3;

public class Task2 {
    public static void main(String[] args) {

        double max = -15;
        double i = (Math.pow(max,2) - max + 3);
        for (double x = -15; x <= 15 ; x+=0.01) {
            if ((Math.pow(x,2) - x + 3) > (Math.pow(max,2) - max + 3)){
                max = x;
                i = Math.pow(x,2) - x + 3;
            }

        }
        System.out.println("x = " + max);
        System.out.println("func = " + i);
    }
}
