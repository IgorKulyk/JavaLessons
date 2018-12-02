package Lesson8;

import java.util.Random;

//Поделить на два все элементы двумерного массива, большие десяти по модулю.
public class Task24 {
    public static void main(String[] args) {

        double[][] data = new double[5][5];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(50) - 25;
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (Math.abs(data[i][j]) > 10) {
                    data[i][j] /= 2;
                }
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
