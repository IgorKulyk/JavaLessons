package Lesson24;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<LivingCreature> Kingdom = new ArrayList<>();
        Kingdom.add(new King(Randomizer.getname(), 100));
        for (int i = 0; i < 10; i++) {
            Kingdom.add(new Noble(Randomizer.getname(), 80));
        }

        for (int i = 0; i < 25; i++) {
            Kingdom.add(new Knight(Randomizer.getname(), 60));
        }

        for (int i = 0; i < 100; i++) {
            Kingdom.add(new Peasant(Randomizer.getname(), 40));
        }

        for (int i = 0; i < 5; i++) {
            for (LivingCreature livingCreature : Kingdom)
                if (livingCreature.IsAlive()) {
                    livingCreature.LoseHp(random.nextInt(50));
                    if (!livingCreature.IsAlive()) {
                        livingCreature.Die();
                    }
                }
        }


        for (
                LivingCreature livingCreature : Kingdom) {
            if (livingCreature.IsAlive())
                System.out.println(livingCreature.toString());
        }
    }
}

class Randomizer {

    static String[] firstWord = {"Тупой", "Злой", "Красный", "Укуренный", "Ужасный", "Кровавый", "Легендарный", "Фееричный",
            "Конченный", "Сурогатный", "Пассивный", "Странный", "Ебанутый", "Отпизженный", "Конченный", "Отсталый", "Сексуальный", "Борзый", "Рофльный", "Жирненький",
            "Тощий", "Приунывший", "Грустный", "Разъебаный", "Негативный"};
    static String[] secondWord = {"Олень", "Ларин", "Макс", "Дёма", "Рома", "Ираклий", "Влад", "Виталик", "Игорь", "Артем", "Бодя", "Миша",
            "Леша", "Пес", "Никита", "Конь", "Писюн", "Хатуль", "Келев"};

    static String getname() {
        Random random = new Random();
        return secondWord[random.nextInt(secondWord.length)];
    }

}

abstract class LivingCreature {
    private String name;
    private int hp;

    public LivingCreature(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public boolean IsAlive() {
        if (hp > 0)
            return true;
        else
            return false;
    }

    public void LoseHp(int hp) {
        this.hp -= hp;
    }

    public abstract void Die();

    @Override
    public String toString() {
        return name + '\'' +
                ", hp=" + hp +
                '}';
    }
}

class King extends LivingCreature {

    public King(String name, int hp) {
        super("King " + name, hp);
    }

    @Override
    public void Die() {
        System.out.println("But I'm... king...");
    }
}

class Noble extends LivingCreature {
    public Noble(String name, int hp) {
        super("Noble " + name, hp);
    }

    @Override
    public void Die() {
        System.out.println("It was so close...");
    }
}

class Knight extends LivingCreature {

    public Knight(String name, int hp) {
        super("Knight " + name, hp);
    }

    @Override
    public void Die() {
        System.out.println("My life for king!...");
    }
}

class Peasant extends LivingCreature {
    public Peasant(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void Die() {
        System.out.println("What?! What's happened?...");
    }
}
