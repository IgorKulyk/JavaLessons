package Lesson3;

public class Task7 {
    public static void main(String[] args) {

        double max = -10;//точка
        double function = 1 / Math.pow(max, 3) + Math.pow(max, 3);//значение функции в точке
        for (double x = -10; x < 10; x += 0.01) {
            if (!(x > -1 && x < 1)) {
                double tmpF = 1 / Math.pow(x, 3) + Math.pow(x, 3);
                if (tmpF > function) {
                    max = x;
                    function = tmpF;
                }
            }
        }
        System.out.println(max);
        System.out.println(function);

    }
}
