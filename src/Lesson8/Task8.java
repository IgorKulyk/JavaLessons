package Lesson8;

//Найти сумму положительных элементов массива.
public class Task8 {
    public static void main(String[] args) {
        int[] data = {0, -1, 1, 0, 1, 1, 1, -5};
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                sum += data[i];
            }
        }
        System.out.println(sum);
    }
}
