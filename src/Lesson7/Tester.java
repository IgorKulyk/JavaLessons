package Lesson7;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        int[][] data = new int[7][5];//массив с датой
        fillDataRandom(data);//заполнение массива случайными значениями
        printArray(data);//печать массива на экран
        sord2d(data);//сортировка массива
        System.out.println();//перевод курсора на новую строку
        printArray(data);//печать массива на экран
    }

    static void sord2d(int[][] array) {
        /*
            Почему array[0]?
            Потому что нужно пройтись по всем колоннам. А количество
            колонн в двумерном массиве(если он прямоугольный)
            равно количеству элементов в любой строке. Можно брать
            любую строку(на место нуля любая цифра) НО! мы
            гарантированно знаем, что первая строка существует(а точнее
            нулевая), а про остальные мы не всегда уверенны.
         */
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length - 1; j++) {// -1 чтобы не выйти за границы массива, потому что мы обращаемся к следующему элементу от текущего в цикле
                /*
                 * Если сумма элементо в текущей (j) колонне меньше
                 * чем сумма элементов в следующей (j+1), то меняем их местами
                 * */
                if (summElemsInColum(array, j) <
                        summElemsInColum(array, j + 1)) {
                    changeColums(array, j, j + 1);
                }
            }
        }
    }

    //считает сумме элементов в колонне. Первый парметр, массив.
    // Второй парамет это номер колонны
    static int summElemsInColum(int[][] array, int num) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i][num];
        }
        return summ;
    }


    //Функция для рокировки двух колонн
    //Первый параметр - это массив в котором меняем
    //Второй и третий параметры - это номера колонн, которые меняем местами
    static void changeColums(int[][] array, int x1, int x2) {
        int tmp = 0;
        /*
         Что происходит тут.
         Цикл по количеству строк. В каждой строке меняем местами
         элементы в двух колоннах, индексы которых мы передали на вход
          */
        for (int i = 0; i < array.length; i++) {
            tmp = array[i][x1];
            array[i][x1] = array[i][x2];
            array[i][x2] = tmp;
        }
    }


    //Функция печати массива на экран
    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(summElemsInColum(array, i) + " ");
        }
    }

    //заполнение массива случайными значениями
    static void fillDataRandom(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }
}
