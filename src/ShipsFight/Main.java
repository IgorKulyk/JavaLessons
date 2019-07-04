package BattleShips;

public class Main {
    public static void main(String[] args) {

    }
}

abstract class Ship{
    private int hp;
    private String name;

    public Ship(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


