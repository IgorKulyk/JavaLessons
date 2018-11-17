package Lesson3;

public class Task3 {
    public static void main(String[] args) {

        double max = -10;
        double i = (Math.sin(max) + Math.pow(max,2));
        for (double x = -10; x < 10 ; x+=0.01) {
            if ((Math.sin(x) + Math.pow(x,2)) > (Math.sin(max) + Math.pow(max,2))){
                max = x;
                i = Math.sin(x) + Math.pow(x,2);
            }

        }
        System.out.println("x = " + max);
        System.out.println("func = " + i);
    }
}
