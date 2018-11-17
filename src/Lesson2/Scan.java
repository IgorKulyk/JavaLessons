package Lesson2;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        while (true) {
            System.out.println("Hit enemy?");
            System.out.println("Yes - 1 / No - 2");
            a = scanner.nextInt();
            System.out.println("Punch!");
            System.out.println("");
            if (a == 2){
                break;
            }
        }
        System.out.println("OK, bye!");
    }
}
