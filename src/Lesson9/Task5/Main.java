package Lesson9.Task5;

/*Создать класс “Monster” со строковой переменной для имени, целочисленной переменной для очков
здоровья, двумя вещественными переменными для силы атаки и показателя защиты. Добавить в класс
конструктор с параметрами и функцию для вывода всех параметров, на экран.*/
public class Main {
    public static void main(String[] args) {

    }
}

class Monster {
    private String name;
    private int hp;
    private double att;
    private double def;

    public Monster(String name, int hp, double att, double def) {
        this.name = name;
        this.hp = hp;
        this.att = att;
        this.def = def;
    }

    public void showInfo() {
        System.out.println(this.name);
        System.out.println(this.hp);
        System.out.println(this.att);
        System.out.println(this.def);
    }
}
