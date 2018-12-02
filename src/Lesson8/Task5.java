package Lesson8;
//В произвольной квадратной матрице найти минимальный элемент на главной диагонали

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[][] data = new int[5][5];

        fillDataRandom(data);
        printArray(data);
        findMinMainDiag(data);


    }

    static void fillDataRandom(int[][] array) {
        Random random = new Random(5);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(8) + 1;
            }
        }
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int findMinMainDiag(int[][] array){
        int min = array[0][0];
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j)
                    tmp = array[i][j];
                if(min > tmp)
                    min = tmp;
            }
        }
        System.out.println(min);
        return min;

    }
}