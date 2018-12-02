package Lesson8;

import java.util.Random;

//В целочисленном массиве из n-элементов найти сумму элементов, следующих
//после элемента, равного единице, вывести эту сумму; если такой элемент
//отсутствует, вывести ноль
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(20);
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.println(FindOne(data));
    }

    static int FindOne(int arr[]) {
        int summ = 0;
        boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            if (f) {
                summ += arr[i];
            }
            if (arr[i] == 1) {
                f = true;
            }
        }
        return summ;
    }

}
