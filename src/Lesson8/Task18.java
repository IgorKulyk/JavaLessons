package Lesson8;
//Найти количество элементов, меньших заданного числа k, в одномерном массиве.
public class Task18 {
    public static void main(String[] args) {
        int[] data = {1, 5, 1, 7, 8, 3, 8, 1};
        int k = 3;
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if(data[i] < k){
                count++;
            }
        }
        System.out.println(count);
    }
}
