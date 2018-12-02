package Lesson8;

import java.util.Random;

//Нормировать все элементы квадратного двумерного массива относительно
//максимального по модулю элемента.
public class Task23 {
    public static void main(String[] args) {

        double[][] data = new double[5][5];
        Random random = new Random();
        double max = data[0][0];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = random.nextInt(50) - 25;
                System.out.print(data[i][j] + " ");
                if (Math.abs(data[i][j]) > Math.abs(max)) {
                    max = data[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(max);
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = data[i][j] / max;
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
