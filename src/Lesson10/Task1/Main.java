package Lesson10.Task1;

/*Написать класс калькулятора, хранящего вещественное число x и понимающего следующие команды:
прибавить
к этому числу значение параметра, вычесть из него, домножить его и разделить, а также извлечь из этого числа
квадратный корень и взять тригонометрическую функцию. Написать еще один класс, кроме перечисленного
имеющий
одну ячейку памяти и понимающий команды записать в память, извлечь из памяти, добавить x к содержимому
памяти.*/
public class Main {
    public static void main(String[] args) {

    }
}

class Calculator {
    private double x;

    public Calculator(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double plusCalc(double y) {
        return getX() + y;
    }

    public double minusCalc(double y){
        return getX() - y;
    }

    public double multCalc(double y){
        return  getX() * y;
    }

    public double divCalc(double y){
        return getX() / y;
    }

    public double sqrtCalc(){
        return Math.sqrt(getX());
    }

    public double sinCalc(){
        return Math.sin(getX());
    }
}
