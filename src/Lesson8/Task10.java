package Lesson8;

//Найти три самых больших элемента в массиве. Например, для массива [5,1,4,8,3,5,2,7] ответ будет 8, 7, 5.
public class Task10 {
    public static void main(String[] args) {
        int[] data = {5, 1, 4, 8, 3, 5, 2, 7};
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] < data[i + 1]) {
                    isSorted = false;

                    buf = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = buf;
                }
            }
        }
        System.out.println(data[0] + " " + data[1] + " " + data[2] + " ");
    }
}