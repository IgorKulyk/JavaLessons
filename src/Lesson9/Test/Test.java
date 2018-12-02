package Lesson9.Test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        LibNick libNick = new LibNick(10);
        BookNick bookNick = new BookNick("Nick", "Life with java", 2018);
        libNick.printLib();
        System.out.println();
        libNick.add(bookNick);
        libNick.printLib();
        System.out.println();
        libNick.add(new BookNick("Nick", "Life after Java", 2019));
        libNick.printLib();
        System.out.println();
        libNick.sortByYears();
        libNick.printLib();

    }
}


class BookNick {
    String author;
    String name;
    int year;

    public BookNick() {
        PurpleGenerator purpleGenerator = new PurpleGenerator();
        Random random = new Random();
        name = "-" + purpleGenerator.generateName() + "-";
        author = purpleGenerator.generateName();
        year = random.nextInt(200) + 1800;
    }

    public BookNick(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public void printBook() {
        System.out.println(year + " " + author + " " + name);
    }
}

class LibNick {
    BookNick[] bookNicks;
    int size;

    LibNick(int size) {
        bookNicks = new BookNick[size];
        this.size = size;
        for (int i = 0; i < size; i++) {
            bookNicks[i] = new BookNick();
        }
    }

    public void printLib() {
        for (int i = 0; i < size; i++) {
            bookNicks[i].printBook();
        }
    }

    public void sortByYears() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (bookNicks[j].year > bookNicks[j + 1].year) {
                    BookNick tmp = bookNicks[j];
                    bookNicks[j] = bookNicks[j + 1];
                    bookNicks[j + 1] = tmp;
                }
            }
        }
    }

    public void add(BookNick bookNick) {
        if (bookNicks.length == size) {
            BookNick[] tmp = new BookNick[bookNicks.length * 2];
            for (int i = 0; i < size; i++) {
                tmp[i] = bookNicks[i];
            }
            bookNicks = tmp;
        }
        bookNicks[size] = bookNick;
        size++;
    }
}

//Класс в котором будут все генераторы
class PurpleGenerator {
    //Массив с частями слова для формирования имён
    String[] partsOfName = {"na", "ma", "no", "bo", "i", "y", "e",
            "hi", "lu", "o", "a", "pe", "lol", "kek", "ra",
            "cheb", "oma", "hu"};

    //функция которая возвращает сгенерированное имя на основе слогов
    public String generateName() {
        Random random = new Random();
        String res = "";//строка с результатом
        res += (char) (random.nextInt(27) + 65);//генерируем случайную заглавную букву
        for (int i = 0; i < random.nextInt(5) + 1; i++) {//делаем случайное количество слогов
            //в результат записываем слог из массива
            //берем случайны элемент массива, индекс генерируется случайно
            //из диапазона коим является длина массива
            res += partsOfName[random.nextInt(partsOfName.length)];
        }
        return res;
    }
}
