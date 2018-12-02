package Lesson8;

import java.util.Random;

//Найти сумму элементов на главной и побочной диагоналях в квадратном
//двумерном массиве.
public class Task22 {
    public static void main(String[] args) {

        double[][] data = new double[3][3];
        Random random = new Random();
        double mainsum = 0;
        double sidesum = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(8) + 1;
                System.out.print(data[i][j] + " ");
                if (i == j) {
                    mainsum += data[i][j];
                }
                if (i + j == data.length - 1) {
                    sidesum += data[i][j];
                }

            }
            System.out.println();
        }
        System.out.println(mainsum);
        System.out.println(sidesum);
    }

}
