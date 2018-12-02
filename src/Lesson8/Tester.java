package Lesson8;

public class Tester {
    public static void main(String[] args) {
        int[] data = {3, 4, 5, 6, 7, 0, 0, 3, 1, 5, 0};

        long startTime = System.nanoTime();//берем время начала выполнения
        //
        System.out.println(summAfterOne(data));//тут идёт вся жара

        //
        long endTime = System.nanoTime();//берем время конца выполнения
        System.out.println(endTime - startTime);//выводим разницу

    }


    public static int summAfterOne(int[] data) {
        int summ = 0;//сумма элементов
        boolean haveOne = false;//флаг обозначающий что мы нашли еденичку.
        // Изначально false т.к. предполагаем, что еденичек нет
        for (int i = 0; i < data.length; i++) {//бежим по массиву
            if (haveOne) {//если флаг на наличие еденички true то суммируем элемент
                summ += data[i];//суммируем
            }
            if (data[i] == 1) {//если выбранный элемент равен еденичке, то стивм флаг
                //на true
                haveOne = true;//ставим флаг
            }
            //обратите внимание, что там два if'a без els'ов
        }
        return summ;//возвращаем сумму
    }
}
