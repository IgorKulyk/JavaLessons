package Lesson8;
//Найти количество элементов, равных нулю, в одномерном массиве.
public class Task17 {
    public static void main(String[] args) {
        int[] data = {0, 5, 1, 7, 0, 1, 8, 0};
        int zero = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == 0){
                zero++;
            }
        }
        System.out.println(zero);
    }
}
