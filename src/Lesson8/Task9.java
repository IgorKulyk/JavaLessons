package Lesson8;

//Проверить, что все элементы в массиве расположены по возрастанию.
public class Task9 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, -8};
        boolean f = true;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                f = false;
                break;
            }
        }
        System.out.println(f);
    }
}
