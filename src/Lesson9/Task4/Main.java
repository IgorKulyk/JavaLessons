package Lesson9.Task4;

/*Создать класс “Human” с двумя строковыми переменными для имени и фамилии, вещественной
переменной для возраста и логической переменной для пола. Добавить в класс конструкторы с
параметрами и без них.*/
public class Main {
    public static void main(String[] args) {

    }
}

class Human{
    private String name;
    private String surname;
    private double age;
    private boolean isMan;

    public Human(String name, String surname, double age, boolean isMan) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMan = isMan;
    }

    public Human() {
    }
}
