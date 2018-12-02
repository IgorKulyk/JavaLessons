package Lesson8;

import java.util.Random;

//Последовательно вывести элементы трехмерного массива в строку через пробел.
public class Task30 {
    public static void main(String[] args) {
        double[][][] data = new double[3][3][3];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = random.nextInt(30) - 15;
                    System.out.print(data[i][j][k] + " ");

                }
            }
        }
    }
}
