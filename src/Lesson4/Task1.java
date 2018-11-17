package Lesson4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        double[] data = new double[15];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(30) - 15; //заполняет массив рандомными числами, самое большое = 3 + 1(что бы небыло нулей)
            System.out.println(data[i]);
        }

        /*Задча 1*/
        /*Найти минимальный элемент в одномерном массиве из n элементов.*/
        double min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println("Минимальный элемент массива = " + min);

        /*Задача 2*/
        /*Найти максимальный элемент в одномерном массиве из n элементов.*/
        double max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println("Максимальный элемент массива = " + max);

        /*Задача 3, 4*/
        /*Найти сумму элементов одномерного массива из n элементов.*/
        /*Найти среднее арифметическое одномерного массива из n элементов.*/
        double tot = 0;
        double mid = 0;
        for (int i = 0; i < data.length; i++) {
            tot += data[i];
            mid = tot / data.length;
        }
        System.out.println("Сумма элементов массива = " + tot);
        System.out.println("Среднее арифметическое элементов массива = " + Math.abs(mid)); // Math.abs() выводит модуль числа

        /*Задача 5*/
        /*Найти произведение элементов одномерного массива, состоящего из n
        элементов.*/
        double pro = 1;
        for (int i = 0; i < data.length; i++) {
            pro *= data[i];
        }
        System.out.println("Произведение элементов массива = " + pro);

        /*Задача 6*/
        /*Найти сумму элементов одномерного массива с нечетными номерами,
        состоящего из n элементов.*/
        double odd = 0;
        for (int i = 1; i < data.length; i = i + 2) {
            odd += data[i];
        }
        System.out.println("Сумма нечетных элементов массива = " + odd);

        /*Задача 7*/
        /*Найти сумму элементов одномерного массива с четными номерами, состоящего
        из n элементов.*/
        double eve = 0;
        for (int i = 0; i < data.length; i = i + 2) {
            eve += data[i];
        }
        System.out.println("Сумма четных элементов массива = " + eve);

        /*Задача 8*/
        /*Найти произведение элементов одномерного массива с нечетными номерами,
        состоящего из n элементов.*/
        double oddpro = 1;
        for (int i = 1; i < data.length; i = i + 2) {
            oddpro *= data[i];
        }
        System.out.println("Произведение нечетных элементов = " + oddpro);

        /*Задача 9*/
        /*Найти произведение элементов одномерного массива с четными номерами,
        состоящего из n элементов.*/
        double evepro = 1;
        for (int i = 0; i < data.length; i = i + 2) {
            evepro *= data[i];
        }
        System.out.println("Произведение нечетных элементов = " + evepro);

        /*Задача 10*/
        /*Найти количество элементов, равных нулю, в одномерном массиве, состоящем
        из n элементов.*/
        double zero = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) zero++;
        }
        System.out.println("Количество элементов равных нулю = " + zero);

        /*Задача 11*/
        /*Найти количество нечетных элементов в одномерном массиве, состоящем из n
        элементов.*/
        double oddnum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0 && data[i] != 0) oddnum++;
        }
        System.out.println("Количество нечетных элементов = " + oddnum);

        /*Задача 12*/
        /*Найти количество четных элементов в одномерном массиве, состоящем из n
        элементов.*/
        double evenum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0 && data[i] != 0) evenum++;
        }
        System.out.println("Количество четных элементов = " + evenum);

        /*Задача 13*/
        /*Найдите количество элементов, превышающих заданное число k, в
        одномерном массиве, состоящем из n элементов.*/
        int k = 2;
        int above = 0; // Для счетчиков нужно использовать тип int
        for (int i = 0; i < data.length; i++) {
            if (data[i] > k) above++;
        }
        System.out.println("Количество элементов больше " + k + " = " + above);

        /*Задача 14*/
        /*Найти количество элементов, не превышающих заданное число k, в
        одномерном массиве, состоящем из n элементов.*/
        int less = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < k) less++;
        }
        System.out.println("Количество элементов меньше " + k + " = " + less);

        /*Задача 15*/
        /*Найти количество элементов, больших заданного числа k, в одномерном
        массиве, состоящем из n элементов.*/
        int abovenew = 0; // Для счетчиков нужно использовать тип int
        for (int i = 0; i < data.length; i++) {
            if (data[i] > k) abovenew++;
        }
        System.out.println("Количество элементов больше " + k + " = " + abovenew);

        /*Задача 16*/
        /*Найти ближайший к нулю или равный ему элемент в одномерном массиве из n
        элементов.*/
        double modmin = data[0];
        for (int i = 0; i < data.length; i++) {
            if (Math.abs(data[i]) < Math.abs(modmin)) {
                modmin = data[i];
            }
        }
        System.out.println("Ближайший к нулю элемент = " + modmin);

        /*Задача 17*/
        /*Нормировать все элементы в одномерном массиве из n элементов
        относительно максимального элемента.*/
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] / max);
        }
    }
}
