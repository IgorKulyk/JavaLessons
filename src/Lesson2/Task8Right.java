package Lesson2;

public class Task8Right {
    public static void main(String[] args) {
        int x = 3;
        boolean f = true;
        for (int i = 2; i < x; i++){
            if (x % 1 == 0){
                f = false;
                break;

            }
        }
        if (f) {
            System.out.println("ez");
        } else {
            System.out.println("no");
        }
    }
}
