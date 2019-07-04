package Lesson14;

/*Создать функцию, в которую передается либо целочисленное, либо
вещественное, либо строковое значение, после чего на экран выводится тип
переданных в функцию данных и само значение.*/
public class Main {
    public static void main(String[] args) {
        print(5);
    }

    public static <T> void print(T a) {
        if (a instanceof Double) {
            System.out.println("Data type is Double " + a);
        }
        if (a instanceof Integer) {
            System.out.println("Data type is Integer " + a);
        }
        if (a instanceof String) {
            System.out.println("Data type is String " + a);
        }
    }
}
