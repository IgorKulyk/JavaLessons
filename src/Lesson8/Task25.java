package Lesson8;

import java.util.Random;

//Найти сумму элементов трехмерного массива.
public class Task25 {
    public static void main(String[] args) {

        double[][][] data = new double[3][3][3];
        double sum = 0;
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = random.nextInt(10) + 1;
                    sum += data[i][j][k];
                    System.out.print(data[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
