package Lesson3;

public class Task1 {
    public static void main(String[] args) {

        double max = 0;
        double i = 0;
        for (double x = 0; x <= 10; x += 0.01) {
            if (Math.pow(x, 2) > Math.pow(max, 2)) {
                max = x;
                i = Math.pow(x, 2);
            }

        }
        System.out.println("x = " + max);
        System.out.println("func = " + i);

    }
}
//Math.pow возводит число до запятой в степень после запятой
//Math.sin()
//Math.E - epsilon (e)
//Math.PI - Pi (3.14...)