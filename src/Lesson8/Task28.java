package Lesson8;

import java.util.Random;

//Отсортировать по возрастанию элементы трехмерного массива.
public class Task28 {
    public static void main(String[] args) {
        double[][][] data = new double[3][3][3];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = random.nextInt(30) - 15;
                    System.out.print(data[i][j][k] + " ");

                }
                System.out.println();
            }
            System.out.println();
        }

        // Преобразуем трехмерный массив в одномерный
        double[] tmpArr = new double[data.length * data[0].length * data[0][0].length];
        int countTMP = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    tmpArr[countTMP] = data[i][j][k];
                    countTMP++;
                }

            }
        }

        // Сортируем одномерный массив
        for (int i = tmpArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (tmpArr[j] > tmpArr[j + 1]) {
                    double tmp = tmpArr[j];
                    tmpArr[j] = tmpArr[j + 1];
                    tmpArr[j + 1] = tmp;
                }
            }
        }

        // Преобразуем отсортированный одномерный массив в трехмерный
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                for (int k = 0; k < data[i][j].length; k++) {
                    data[i][j][k] = tmpArr[count];
                    count++;
                    System.out.print(data[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
