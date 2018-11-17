package Lesson2;

public class Task9 {
    public static void main(String[] args) {
        int a = 15;
        for (int i = a; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
