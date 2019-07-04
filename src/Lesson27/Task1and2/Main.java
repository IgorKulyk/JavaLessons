package Lesson27;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*Создать класс студент с полями фамилия, имя, массив с оценками и поле со средним
значением оценки. Используя сериализацию записать в файл данные о 10 студентах и
впоследствии считать из файла и вывести информацию о них.*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        String filename = "src\\tmp\\lesson27.txt";
        for (int i = 0; i < 5; i++) {
            students.add(new Student("Surname" + i, "Name" + i));
        }
        for (Student student : students) {
            student.setGrades();
            student.setAvergrade();
            student.print();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(students);
            System.out.println("File has been writen");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        ArrayList<Student> newStudents = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            newStudents = ((ArrayList<Student>) ois.readObject());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("---------------------------------");
        for (Student newStudent : newStudents) {
            System.out.printf("Name: %s \t Surname: %s \t", newStudent.getName(), newStudent.getSurname());
            System.out.println(" Grades: " + Arrays.toString(newStudent.getGrades()) +
                    " Average: " + newStudent.getAvergrade());
        }
    }
}


class Student implements Serializable {
    private String surname;
    private String name;
    private int[] grades;
    private transient int avergrade;

    public Student(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public int getAvergrade() {
        return avergrade;
    }

    public void print() {
        System.out.println(getName() + " " + getSurname() + " grades: " +
                Arrays.toString(getGrades()) + " average: " + getAvergrade());
    }

    public void setGrades() {
        this.grades = FillGrades();
    }

    public void setAvergrade() {
        this.avergrade = FillAverGrade(getGrades());
    }

    public int[] FillGrades() {
        int[] grades = new int[5];
        Random random = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(5) + 1;
        }
        return grades;
    }

    public int FillAverGrade(int[] grades) {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }
}