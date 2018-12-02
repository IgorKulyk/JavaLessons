package Lesson8;

import java.util.Random;

//Поменять знак у всех отрицательных элементов трехмерного массива.
public class Task26 {
    public static void main(String[] args) {
        double[][][] data = new double[3][3][3];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = random.nextInt(30) - 15;
                    if (data[i][j][k] < 0) {
                        data[i][j][k] = Math.abs(data[i][j][k]);
                    }
                    System.out.print(data[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
