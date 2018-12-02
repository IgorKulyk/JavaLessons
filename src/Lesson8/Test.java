package Lesson8;

import java.util.Random;

// Сортировка двумерного массива без переноса его в одномерный!!!

public class Test {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(30);
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        for (int i = 0; i < array.length * array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array[j].length - 1; k++) {
                    if (array[j][k] < array[j][k + 1]) {
                        int tmp = array[j][k];
                        array[j][k] = array[j][k + 1];
                        array[j][k + 1] = tmp;
                    }

                }
                if (j == array.length - 1)
                    continue;
                if (array[j][array[j].length - 1] < array[j + 1][0]) {
                    int tmp = array[j][array[j].length - 1];
                    array[j][array[j].length - 1] = array[j + 1][0];
                    array[j + 1][0] = tmp;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
}
