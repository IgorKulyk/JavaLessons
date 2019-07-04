package Lesson11;

/*Создать абстрактный класс “Dog” с переменными для клички, пола, веса собак,
содержащий также абстрактные методы Voice и Action. Наследовать от него три
обычных класса “DomesticDog”, “ServiceDog” и “HomelessDog”, для каждого из которых
определить строковую переменную address, organization, area соответственно.*/
public class Main {
    public static void main(String[] args) {

    }
}

abstract class Dog {
    private String name;
    private boolean isMale;
    private double weight;

    public Dog(String name, boolean isMale, double weight) {
        this.name = name;
        this.isMale = isMale;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void Voice();

    public abstract void Action();
}

class DomesticDog extends Dog {

    private String adress;

    public DomesticDog(String name, boolean isMale, double weight, String adress) {
        super(name, isMale, weight);
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public void Voice() {
        System.out.println("THIS IS MY HOME!!!!!!! GET OUT FROM HERE!!!!!");
    }

    @Override
    public void Action() {
        System.out.println("***wag the tail***");
    }
}

class ServiceDog extends Dog {

    private String organization;

    public ServiceDog(String name, boolean isMale, double weight, String organization) {
        super(name, isMale, weight);
        this.organization = organization;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public void Voice() {
        System.out.println("I'm serving for your safety");
    }

    @Override
    public void Action() {
        System.out.println("***sit down***");
    }
}