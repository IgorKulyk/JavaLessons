package Lesson9.Task9;

import java.util.Scanner;

/*Создать класс “Date” с тремя целочисленными показателями для определения дня, месяца и года.
Добавить в класс функции для определения по дате времени года, номера дня в году, а также функцию
для расчета количества дней между двумя датами, принимающую на вход объект данного класса.*/
public class Main {
    public static void main(String[] args) {
        Date dateOne = new Date();
        Date dateTwo = new Date();
        dateOne.scanDate();
        dateOne.printDate();
        dateOne.findSeason();
        System.out.println("This is the " + dateOne.findNumberInYear() + " day of the year");
        System.out.println();
        dateTwo.scanDate();
        dateTwo.printDate();
        dateTwo.findSeason();
        System.out.println("This is the " + dateTwo.findNumberInYear() + " day of the year");
        System.out.println();
        Date.distanceFromDateToDate(dateOne, dateTwo);


    }
}

class Date {
    int date;
    int month;
    int year;

    public Date() {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void scanDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in format DD");
        this.date = scanner.nextInt();
        if (date >= 1 && date <= 31) {
            System.out.println("Enter month in format MM");
            this.month = scanner.nextInt();
            if (month >= 1 && month <= 12) {
                if (month == 2 && date >= 28) {
                    System.out.println("There is no such date in February");
                } else {
                    System.out.println("Enter year in format YYYY");
                    this.year = scanner.nextInt();
                }
            } else {
                System.out.println("Wrong month");
            }
        } else {
            System.out.println("Wrong date");
        }
    }

    public void printDate() {
        System.out.printf("Your date is: %d.%d.%d", date, month, year);
    }

    public void findSeason() {
        if (month >= 1 && month <= 2 || month == 12) {
            System.out.println(" and this is Winter");
        }
        if (month >= 3 && month <= 5) {
            System.out.println(" and this is Spring");
        }
        if (month >= 6 && month <= 8) {
            System.out.println(" and this is Summer");
        }
        if (month >= 9 && month <= 11) {
            System.out.println(" and this is Autumn");
        }
    }

    public int findNumberInYear() {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayCNT = 0;
        for (int i = 0; i < this.month - 1; i++) {
            dayCNT += months[i];
        }
        dayCNT = dayCNT + this.date;
        return dayCNT;
    }

    public static void distanceFromDateToDate(Date dateOne, Date dateTwo) {
        int dist = 0;
        if (dateOne.year != dateTwo.year){
            dist = Math.abs(dateOne.year - dateTwo.year) * 365;
        }
        dist += dateOne.findNumberInYear() - dateTwo.findNumberInYear();
        System.out.println("Distance from first date to second is " + Math.abs(dist) + " day('s)");
    }

}
