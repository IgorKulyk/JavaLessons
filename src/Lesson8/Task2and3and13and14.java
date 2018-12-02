package Lesson8;

import java.util.Random;

//  Найти максимальное значение в целочисленном массиве из n-элементов
//(решить задачу с помощью for)
//  Найти минимальное значение в целочисленном массиве из n-элементов (решить
//задачу с помощью for)
//  Найти минимальный элемент в одномерном массиве.
//  Найти максимальный элемент в одномерном массиве.
public class Task2and3and13and14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[10];
        int max = data[0];
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100) - 50;
            System.out.print(data[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
            if(data[i] < min){
                min = data[i];
            }
        }
        System.out.println("Максимальный элемент массива = " + max);
        System.out.println("Минимальный элемент массива = " + min);

    }
}
