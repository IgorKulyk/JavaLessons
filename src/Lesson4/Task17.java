package Lesson4;

import java.util.Random;

public class Task17 {
    public static void main(String[] args) {
        Random random = new Random();//через него рандомят цифры
        double[] data = new double[5];//массив с датой

        //заполнение массива случайными значениями
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(99) + 1;
        }

        //печать массива на экран
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        //нахождение максимума
        double max = data[0];//переменная для хранения max
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        System.out.println("Максимум - " + max);

        //нормаирование относительно максимума
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] / max;
        }

        //печать массива на экран
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }
}
