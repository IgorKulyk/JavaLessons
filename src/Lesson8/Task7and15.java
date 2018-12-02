package Lesson8;

//Проверить, что все элементы в массиве одинаковы. Вывести “true” если одинаковы и “false” если нет.
//Проверить, все ли элементы в массиве различны. Вывести “true” или “false” соответственно.
public class Task7and15 {
    public static void main(String[] args) {
        int[] data = {1, 2, 1, 1, 1, 1, 1, 1};
        int tmp = 0;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                tmp += 1;
            }

        }
        if (tmp == data.length - 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

