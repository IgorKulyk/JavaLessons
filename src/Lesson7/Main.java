package Lesson7;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] data = new int[3][3];
        fillDataRandom(data);
        System.out.println("Исходный массив:");
        printArray(data);
        sortArrayUp(data);
        System.out.println("Массив отсортированный по возрастанию:");
        printArray(data);
        sortArrayDn(data);
        System.out.println("Массив отсортированный по убыванию:");
        printArray(data);
        fillDataRandom(data);
        System.out.println("Исходный массив:");
        printArray(data);
        sortArrStrDn(data);
        System.out.println("Массив отсортированный по убыванию суммы строк:");
        printArray(data);
        sortArrStrUp(data);
        System.out.println("Массив отсортированный по возрастанию суммы строк:");
        printArray(data);
        fillDataRandom(data);
        System.out.println("Исходный массив:");
        printArray(data);
        sort2dDn(data);
        System.out.println("Массив отсортированный по убыванию суммы столбцов:");
        printArray(data);
        sort2dUp(data);
        System.out.println("Массив отсортированный по возрастанию суммы столбцов:");
        printArray(data);
        fillDataRandom(data);
        System.out.println("Исходный массив:");
        printArray(data);
        SimpleRow(data);
        SimpleCol(data);
        MultiplyedArr(data, data);


    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void fillDataRandom(int[][] array) {
        Random random = new Random(5);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    static void sortArrayUp(int[][] array) {
        // Преобразуем двумерный массив в одномерный
        int[] tmpArr = new int[array.length * array[0].length];
        int countTMP = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tmpArr[countTMP] = array[i][j];
                countTMP++;
            }
        }
        //System.out.println(Arrays.toString(tmpArr));

        // Сортируем одномерный массив
        for (int i = tmpArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (tmpArr[j] > tmpArr[j + 1]) {
                    int tmp = tmpArr[j];
                    tmpArr[j] = tmpArr[j + 1];
                    tmpArr[j + 1] = tmp;
                }
            }
        }
        //System.out.println(Arrays.toString(tmpArr));

        // Преобразуем отсортированный одномерный массив в двумерный
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = tmpArr[count];
                count++;
                //System.out.print(array[i][j] + " ");
            }
            //System.out.println();
        }

    }

    static void sortArrayDn(int[][] array) {
        // Преобразуем двумерный массив в одномерный
        int[] tmpArr = new int[array.length * array[0].length];
        int countTMP = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                tmpArr[countTMP] = array[i][j];
                countTMP++;
            }
        }
        //System.out.println(Arrays.toString(tmpArr));

        // Сортируем одномерный массив
        for (int i = tmpArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (tmpArr[j] < tmpArr[j + 1]) {
                    int tmp = tmpArr[j];
                    tmpArr[j] = tmpArr[j + 1];
                    tmpArr[j + 1] = tmp;
                }
            }
        }
        //System.out.println(Arrays.toString(tmpArr));

        // Преобразуем отсортированный одномерный массив в двумерный
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = tmpArr[count];
                count++;
                // System.out.print(array[i][j] + " ");
            }
            // System.out.println();
        }

    }

    static int summElemArray(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }

    static void sortArrStrDn(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (summElemArray(array[j]) < summElemArray(array[j + 1])) {
                    //меняем местами строки в массиве
                    int[] tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    static void sortArrStrUp(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (summElemArray(array[j]) > summElemArray(array[j + 1])) {
                    //меняем местами строки в массиве
                    int[] tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    static int summElemInColumn(int[][] array, int num) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i][num];
        }
        return summ;
    }

    static void changeColumn(int[][] array, int x1, int x2) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i][x1];
            array[i][x1] = array[i][x2];
            array[i][x2] = tmp;
        }
    }

    static void sort2dDn(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length - 1; j++) {
                if (summElemInColumn(array, j) < summElemInColumn(array, j + 1)) {
                    changeColumn(array, j, j + 1);
                }
            }
        }
    }

    static void sort2dUp(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0].length - 1; j++) {
                if (summElemInColumn(array, j) > summElemInColumn(array, j + 1)) {
                    changeColumn(array, j, j + 1);
                }
            }
        }
    }

    static void SimpleRow(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (findSimple(array[i][j])) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Количество строк с простыми числами = " + count);
    }

    static boolean findSimple(int sim) {
        boolean f = true;
        for (int i = 2; i < sim; i++) {
            if (sim % i == 0) {
                f = false;
                break;
            }
        }
        return f;
    }

    // Переделать!!!
    static void SimpleCol(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (findSimple(array[i][j])) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Количество столбцов с простыми числами = " + count);
    }

    static int[][] MultiplyedArr(int[][] array1, int[][] array2) {
        int[][] NewArr = new int[array1.length][array2[0].length];
        if (array1[0].length == array2.length)
            for (int i = 0; i < array1[0].length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    int tmp = 0;
                    for (int k = 0; k < array2.length; k++) {
                        tmp += array1[i][k] * array2[k][j];
                    }
                    NewArr[i][j] = tmp;
                }
            }
        else
            System.out.println("Матрицы нельзя умножить");
        return NewArr;
    }
}



