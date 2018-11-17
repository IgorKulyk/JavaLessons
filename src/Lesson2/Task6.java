package Lesson2;

public class Task6 {
    public static void main(String[] args) {
        int month = 1;
        if (month >= 1 && month <= 2 || month == 12) {
            System.out.println("Зима");
        }
        if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        }
        if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        }
        if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        }
    }
}
