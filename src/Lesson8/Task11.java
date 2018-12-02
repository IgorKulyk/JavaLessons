package Lesson8;

import java.util.Arrays;

//Перевернуть массив. Например, [2, 3, 5] превращается в [5, 3, 2].
public class Task11 {
    public static void main(String[] args) {
        int[] data = {0, 1, 2, 3, 4, 5};
        int tmp;
        for (int i = 0; i < data.length / 2; i++) {
            tmp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = tmp;

        }
        System.out.println(Arrays.toString(data));

//        int[] arr = new int[data.length];
//        int i = arr.length - 1;
//        for (int x : data) {
//            arr[i] = x;
//            i--;
//        }
//        System.out.println(Arrays.toString(arr));
    }
}


