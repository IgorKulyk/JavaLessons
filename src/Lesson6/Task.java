package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        int[][] data = new int[5][9];
        fillRandom(data, 80);
        System.out.println("Before");
        printArray(data);
        sort2dArray(data);
        System.out.println("After");
        printArray(data);
    }

    //сортируем двумерный массив
    static void sort2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (summElemArray(array[j]) < summElemArray(array[j + 1])) {
                    //меняем местами строки в массиве
                    int[] tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    //сумма элементов в одномерном массиве
    static int summElemArray(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }

    //печать двумерного массива
    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print(" = " + summElemArray(array[i]) + "\n");
        }
    }

    //заполняем двумерный массив случайными значениями до заданного диапазона
    static void fillRandom(int[][] array,int bound) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(bound) + 10;
            }
        }
    }
}
