package Lesson8;

import java.util.Arrays;

//Создать символьный массив, содержащий латинский алфавит
public class Task1 {
    public static void main(String[] args) {
        char AlefBet[] = new char[26];
        for (int i = 0; i < 26; i++) {
            AlefBet[i] = (char)(i + 65);
        }
        System.out.println(Arrays.toString(AlefBet));
    }
}
