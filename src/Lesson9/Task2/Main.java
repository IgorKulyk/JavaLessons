package Lesson9.Task2;

import java.util.Scanner;

/*Создать класс “Fraction” с двумя вещественными переменными для задания значений числителя и
знаменателя. Добавить в класс функции сложения, вычитания, умножения и деления, а также
функцию для вывода дроби.*/
public class Main {
    public static void main(String[] args) {
        Fraction fractionOne = new Fraction();
        Fraction fractionTwo = new Fraction();
        fractionOne.scanFraction();
        fractionOne.printFraction();
        fractionTwo.scanFraction();
        fractionTwo.printFraction();
        Fraction.multFraction(fractionOne, fractionTwo);
        Fraction.divFraction(fractionOne, fractionTwo);
        Fraction.sumFraction(fractionOne, fractionTwo);

    }
}

class Fraction {
    private int chi;
    private int zna;

    public Fraction() {

    }

    public int getChi() {
        return chi;
    }

    public void setChi(int chi) {
        this.chi = chi;
    }

    public int getZna() {
        return zna;
    }

    public void setZna(int zna) {
        this.zna = zna;
    }

    public void scanFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter chislitel");
        this.setChi(scanner.nextInt());
        System.out.println("Enter znamenatel");
        this.setZna(scanner.nextInt());
    }

    public void printFraction() {
        System.out.println("Your fraction is:");
        System.out.println(getChi());
        System.out.println("---");
        System.out.println(getZna());
    }

    public static Fraction multFraction(Fraction fractionOne, Fraction fractionTwo) {
        Fraction fractionTMP = new Fraction();
        fractionTMP.setChi(fractionOne.getChi() * fractionTwo.getChi());
        fractionTMP.setZna(fractionOne.getZna() * fractionTwo.getZna());
        System.out.println();
        System.out.println("Result of fraction's multiplication is:");
        System.out.println(fractionTMP.getChi());
        System.out.println("-");
        System.out.println(fractionTMP.getZna());
        return fractionTMP;
    }

    public static Fraction divFraction(Fraction fractionOne, Fraction fractionTwo) {
        Fraction fractionTMP = new Fraction();
        fractionTMP.setChi(fractionOne.getChi() * fractionTwo.getZna());
        fractionTMP.setZna(fractionOne.getZna() * fractionTwo.getChi());
        System.out.println();
        System.out.println("Result of fraction's division is:");
        System.out.println(fractionTMP.getChi());
        System.out.println("-");
        System.out.println(fractionTMP.getZna());
        return fractionTMP;
    }

    public static Fraction sumFraction(Fraction fractionOne, Fraction fractionTwo) {
        Fraction fractionTMP = new Fraction();
        fractionTMP.setChi((fractionOne.getChi() * fractionTwo.getZna()) + (fractionTwo.getChi() * fractionOne.getZna()));
        fractionTMP.setZna(fractionOne.getZna() * fractionTwo.getZna());
        System.out.println();
        System.out.println("Result of fraction's summ is:");
        System.out.println(fractionTMP.getChi());
        System.out.println("-");
        System.out.println(fractionTMP.getZna());
        return fractionTMP;
    }
}


