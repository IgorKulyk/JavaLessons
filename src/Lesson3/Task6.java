package Lesson3;

public class Task6 {
    public static void main(String[] args) {

        double max = -10;//точка
        double function = 1 / Math.pow(max, 3);//значение функции в точке
        // 1/x^3  [-10;-1] [1;10]
        for (double x = -10; x < 10; x += 0.01) {
            if (!(x > -1 && x < 1)) {
                double tmpF = 1 / Math.pow(x, 3);
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
