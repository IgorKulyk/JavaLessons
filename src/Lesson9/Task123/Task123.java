package Lesson9.Task123;

public class Task123 {
    public static void main(String[] args) {
        double a = 5.5;
        long b = Math.round(a);
        System.out.println(b);
    }
}

/*Создать класс “Human” с двумя строковыми переменными для имени и фамилии,
вещественной переменной для возраста и логической переменной для пола.*/
class Human {
    String name;
    String surname;
    int age;
    boolean sex;
}

/*Создать класс “Monster” со строковой переменной для имени, целочисленной переменной
для очков здоровья, двумя вещественными переменными для силы атаки и показателя
защиты*/
class Monster {
    String name;
    int hp;
    double attack;
    double def;
}

/*Создать класс с двумя переменными. Добавить функцию вывода на экран и функцию
изменения этих переменных. Добавить функцию, которая находит сумму значений этих
переменных, и функцию которая находит наибольшее значение из этих двух переменных.*/
class Task333333 {
    int x;
    int y;

    public int sum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    public int max(int x, int y) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }
}

