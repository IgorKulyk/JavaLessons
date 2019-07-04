package Lesson13;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ElfArcher[] elfArchers = new ElfArcher[5];
        ElfWarrior[] elfWarriors = new ElfWarrior[5];
        ElfDruid[] elfDruids = new ElfDruid[5];
        for (int i = 0; i < elfArchers.length; i++) {
            elfArchers[i] = new ElfArcher(random.nextInt(499) + 1,
                                        random.nextInt(199) + 1,
                                        random.nextInt(399) + 1,
                                                PurpleGenerator.getLongWord());

            elfWarriors[i] = new ElfWarrior(random.nextInt(999) + 1,
                                         random.nextInt(99) + 1,
                                       random.nextInt(199) + 1,
                                               PurpleGenerator.getLongWord());

            elfDruids[i] = new ElfDruid(random.nextInt(99) + 1,
                                     random.nextInt(199) + 1,
                                   random.nextInt(999) + 1,
                                           PurpleGenerator.getLongWord());
        }

        print(elfArchers);
        print(elfWarriors);
        print(elfDruids);
    }

    public static <T> void print(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }
}

abstract class Elf {
    private int hp;
    private int speed;
    private int damage;
    private String name;

    public Elf(int hp, int speed, int damage, String name) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        this.name = name;
    }

    public Elf() {
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void say();
}

class ElfArcher extends Elf {

    public ElfArcher(int hp, int speed, int damage, String name) {
        super(hp, speed, damage, name);
    }


    @Override
    void say() {
        System.out.println("My arrow will hit your head!!!");
    }

    @Override
    public String toString() {
        return "------------------------------" + "\n" +
                "I'm " + getClass().getSimpleName() + "\n" +
                "My name is: " + super.getName() + "\n" +
                "My stats is:" + "\n" +
                "HP = " + super.getHp() + ", DMG = " + super.getDamage() + ", SPD = " + super.getSpeed() + "\n" +
                "------------------------------";

    }

}

class ElfWarrior extends Elf {

    public ElfWarrior(int hp, int speed, int damage, String name) {
        super(hp, speed, damage, name);
    }

    @Override
    void say() {
        System.out.println("My sword protect the woods");
    }

    @Override
    public String toString() {
        return "------------------------------" + "\n" +
                "I'm " + getClass().getSimpleName() + "\n" +
                "My name is: " + super.getName() + "\n" +
                "My stats is:" + "\n" +
                "HP = " + super.getHp() + ", DMG = " + super.getDamage() + ", SPD = " + super.getSpeed() + "\n" +
                "------------------------------";

    }
}

class ElfDruid extends Elf {

    public ElfDruid(int hp, int speed, int damage, String name) {
        super(hp, speed, damage, name);
    }

    @Override
    void say() {
        System.out.println("Nature will help me");
    }

    @Override
    public String toString() {
        return "------------------------------" + "\n" +
                "I'm " + getClass().getSimpleName() + "\n" +
                "My name is: " + getName() + "\n" +
                "My stats is:" + "\n" +
                "HP = " + getHp() + ", DMG = " + getDamage() + ", SPD = " + getSpeed() + "\n" +
                "------------------------------";

    }
}

class PurpleGenerator {
    private static Random random = new Random();
    static String[] firstWord = {"Тупой", "Злой", "Красный", "Укуренный", "Ужасный", "Кровавый", "Легендарный", "Фееричный",
            "Конченный", "Сурогатный", "Пассивный", "Странный", "Ебанутый", "Отпизженный", "Конченный", "Отсталый", "Сексуальный", "Борзый", "Рофльный", "Жирненький",
            "Тощий", "Приунывший", "Грустный", "Разъебаный", "Негативный"};
    static String[] secondWord = {"олень", "Ларин", "Макс", "Дёма", "Рома", "Ираклий", "Влад", "Виталик", "Игорь", "Артем", "Бодя", "Миша",
            "Леша", "пес", "Никита", "конь", "писюн", "хатуль", "келев"};

    static String getShortWord() {
        return secondWord[random.nextInt(secondWord.length)];
    }

    static String getLongWord() {
        String res = "";
        res += firstWord[random.nextInt(firstWord.length)] + "_";
        res += secondWord[random.nextInt(secondWord.length)];
        return res;
    }
}
