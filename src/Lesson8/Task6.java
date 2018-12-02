package Lesson8;

//Создать и заполнить единицами произвольный трехмерный массив (решить задачу с помощью while)
public class Task6 {
    public static void main(String[] args) {
        int[][][] Array3D = new int[3][3][3];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < Array3D.length) {
            while (j < Array3D[i].length) {
                while (k < Array3D[i][j].length) {
                    Array3D[i][j][k] = 1;
                    k++;
                }
                j++;
                k = 0;
            }
            i++;
            j = 0;
        }
    }
}
