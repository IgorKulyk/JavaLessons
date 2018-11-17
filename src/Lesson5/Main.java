package Lesson5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double[][] data = new double[3][3];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(8) + 1;

                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }

        /*Задача 18*/
        /*Найти минимальный элемент в двумерном массиве из n элементов.*/
        double min = data[0][0];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < min) {
                    min = data[i][j];
                }
            }
        }
        System.out.println("Минимальный элемент массива = " + min);

        /*Задача 19*/
        /*Найти максимальный элемент в двумерном массиве из n элементов.*/
        double max = data[0][0];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент массива = " + max);

        /*Задача 20, 21*/
        /*Найти сумму элементов двумерного массива из n элементов.*/
        /*Найти среднее арифметическое двумерного массива из n элементов.*/
        double tot = 0;
        double mid = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                tot += data[i][j];
                mid = tot / (data[i].length * data[j].length);
            }
        }
        System.out.println("Сумма элементов массива = " + tot);
        System.out.println("Среднее арифметическое элементов массива = " + mid);

        /*Задача 22*/
        /*Найти сумму элементов на главной диагонали в квадратном двумерном
        массиве из n элементов.*/
        double md = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == j)
                    md = md + data[i][j];
            }
        }
        System.out.println("Сумма элементов главной диагонали = " + md);

        /*Задача 23*/
        /*Найти сумму элементов на побочной диагонали в квадратном двумерном
        массиве из n элементов.*/
        double pd = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == data.length - 1)
                    pd = pd + data[i][j];
            }
        }
        System.out.println("Сумма элементов побочной диагонали = " + pd);

        /*int b = data.length;
        int c = 0;
        for (int i = 0; i < data.length; i++) {
            b--;
            c += data[i][b];
        }
        System.out.println("Сумма элементов побочной диагонали = " + c);
        */

        /*Задача 24*/
        /*Найти определитель квадратного двумерного массива из n элементов.*/
        double a = 0; // главная диагональ
        double b = 0; // главный треугольник 1
        double c = 0; // главный треугольник 2
        double x = 0; // побочная диагональ
        double y = 0; // побочный треугольник 1
        double z = 0; // побочный треугольник 2
        double sum = 0;
        a = data[0][0] * data[1][1] * data[2][2];
        b = data[0][1] * data[1][2] * data[2][0];
        c = data[0][2] * data[1][0] * data[2][1];
        x = data[0][2] * data[1][1] * data[2][0];
        y = data[0][1] * data[1][0] * data[2][2];
        z = data[0][0] * data[1][2] * data[2][1];
        sum = a + b + c - x - y - z;
        System.out.println("Определитель массива = " + sum);

        /*Задача 25*/
        /*Найти обратную матрицу для квадратного двумерного массива.*/



    }
}
