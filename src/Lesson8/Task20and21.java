package Lesson8;

import java.util.Random;

//Найти сумму элементов двумерного массива из n-элементов.
//Найти среднее арифметическое двумерного массива из n-элементов.
public class Task20and21 {
    public static void main(String[] args) {
        double[][] data = new double[5][5];
        Random random = new Random();
        double sum = 0;
        double midsum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(8) + 1;
                System.out.print(data[i][j] + " ");
                sum += data[i][j];
            }
            System.out.println();
        }
        midsum = sum / (data.length * data[0].length);
        System.out.println(sum);
        System.out.println(midsum);

    }
}
