package Lesson8;

import java.util.Random;

//Вычислить среднее арифметическое для всех неотрицательных элементов
//трехмерного массива.
public class Task27 {
    public static void main(String[] args) {
        double[][][] data = new double[3][3][3];
        double sum = 0;
        double midsum = 0;
        int count = 0;
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = random.nextInt(30) - 15;
                    System.out.print(data[i][j][k] + " ");
                    if (data[i][j][k] >= 0) {
                        sum += data[i][j][k];
                        count++;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        midsum = sum / count;
        System.out.println(midsum);

    }
}
