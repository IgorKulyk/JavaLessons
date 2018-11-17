package Lesson6;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        /*Пузырьковая сортировка одномерного массива.*/
        int[] arr = {15, 2, 45, 18, 3, 41};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}