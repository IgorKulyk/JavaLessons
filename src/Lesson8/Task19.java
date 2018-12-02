package Lesson8;

import java.util.Random;

//Нормировать все элементы в одномерном массиве из n-элементов, каждый из
//которых больше, либо равен нулю, относительно их суммы.
public class Task19 {
    public static void main(String[] args) {
        double[] data = new double[10];
        Random random = new Random();
        int summ = 0;

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(30) - 10;
            System.out.print(data[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            summ += data[i];
        }
        System.out.println("Сумма всех элементов = " + summ);

        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 0) {
                data[i] = data[i] / summ;
            }
            System.out.print(data[i] + " ");
        }
    }
}
