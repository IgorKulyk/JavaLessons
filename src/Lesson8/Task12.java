package Lesson8;

import java.util.Arrays;

//Осуществить циклический сдвиг элементов массива вправо. Например, [1, 5, 3, 7]
// после сдвига будет выглядеть так: [7, 1, 5, 3].
public class Task12 {
    public static void main(String[] args) {
        int[] data = {1, 5, 3, 7};
        int tmp;
        for (int i = data.length - 1; i > 0; i--) {
            tmp = data[i];
            data[i] = data[i - 1];
            data[i - 1] = tmp;
        }
        System.out.println(Arrays.toString(data));
    }
}
