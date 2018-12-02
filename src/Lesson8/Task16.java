package Lesson8;

//Определить количество различных элементов в массиве.
public class Task16 {
    public static void main(String[] args) {
        int[] data = {1, 5, 1, 7, 8, 1, 8, 1};
        int count = 1;
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

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1])
                count++;
        }
        System.out.println();
        System.out.println(count);
    }
}
