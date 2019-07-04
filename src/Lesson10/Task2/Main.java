package Lesson10.Task1.Task2;

import java.sql.SQLOutput;

/*Разработать три класса, которые следует связать между собой, используя наследование:
класс Product, который имеет три элемент-данных —
имя, цена и вес товара (базовый класс для всех классов);
класс Buy, содержащий данные о количестве покупаемого
товара в штуках, о цене за весь купленный товар и о весе
товара (производный класс для класса Product и базовый класс для класса Check);
класс Check, не содержащий никаких элемент-данных. Данный класс должен выводить на экран информацию
о товаре и о покупке ( производный класс для класса Buy);
Для взаимодействия с данными классов разработать set- и get—методы.
Все элемент-данные классов объявлять как private.*/
public class Main {
    public static void main(String[] args) {
        Check check = new Check("Nescafe", 10.5, 2, 50);
        check.printProduct();
        check.printBuy();

    }
}

class Product {
    private String name;
    private double price;
    private double weight;


    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Buy extends Product{

    private double qty;

    public Buy(String name, double price, double weight, double qty) {
        super(name, price, weight);
        this.qty = qty;
    }


    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double calcMoney(){
        double tot = 0;
        tot = getPrice() * getQty();
        return tot;
    }

    public double calcWeight(){
        double tot = 0;
        tot = getWeight() * getQty();
        return tot;
    }
}

class Check extends Buy {

    public Check(String name, double price, double weight, double qty) {
        super(name, price, weight, qty);
    }

    public void printProduct(){
        System.out.println("Товар:" + getName());
        System.out.println("Его цена:" + getPrice());
        System.out.println("Его вес:" + getWeight());
    }

    public void printBuy(){
        System.out.println("Кол-во купленного товара = " + getQty());
        System.out.println("Общая цена покупки = " + calcMoney());
        System.out.println("Общий вес покупки = " + calcWeight());
    }

}
