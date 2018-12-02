package Lesson9.TaskStudent;

/*Создайте структуру с именем student, содержащую поля: фамилия и инициалы, номер
группы, успеваемость (массив из пяти элементов). Создать массив из десяти элементов
такого типа, упорядочить записи по возрастанию среднего балла. Добавить возможность
вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5.*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        task.printStudents();
        task.sortStudents();
        System.out.println("-----");
        task.printStudents();
    }
}

class Generator {

    String[] partsOfName = {"na", "ma", "pa", "bo", "hi", "kek", "om", "ra", "da", "sha", "lol", "kol", "am",
            "pop", "ba", "ry", "ru", "ku", "nu", "mi", "ni", "ka", "do",};

    public String generateName() {
        Random random = new Random();
        String res = "";
        res += (char) (random.nextInt(26) + 65);
        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            res += partsOfName[random.nextInt(partsOfName.length)];
        }

        return res;
    }
}

class Task {
    Student[] students;

    Task() {
        Generator generator = new Generator();
        Random random = new Random();
        students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(
                    generator.generateName(),
                    generator.generateName(),
                    random.nextInt(3),
                    new int[]{
                            random.nextInt(5) + 1,
                            random.nextInt(5) + 1,
                            random.nextInt(5) + 1,
                            random.nextInt(5) + 1,
                            random.nextInt(5) + 1,}
            );
        }
    }

    public void sortStudents() {
        Student tmp;//переменна для временного хранилища
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                //сравниваем два студента, точнее для
                // каждого из них вызываем функцию "посчитать среднее"
                // и сравниваем полученные значения
                if (students[j].findAverGrade() >
                        students[j + 1].findAverGrade()) {
                    //и меняем из местами через временную переменную
                    tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }
        }
    }
    //печатаем всех студентов
    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            students[i].showInfo();
        }
    }

}

class Student {
    String surname;
    String name;
    int group;
    int[] progress;

    public Student(String surname, String name, int group, int[] progress) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.progress = progress;
    }

    public double findAverGrade() {
        double aver = 0;
        for (int i = 0; i < progress.length; i++) {
            aver += progress[i];
        }
        aver = aver / progress.length;
        return aver;
    }

    public void showInfo() {
        System.out.println("-----------------");
        System.out.println(surname);
        System.out.println(name);
        System.out.println(group);
        System.out.println(findAverGrade());
        System.out.println("-----------------");

    }

}
