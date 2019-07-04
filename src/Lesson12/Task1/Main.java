package Lesson12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }

    public static int getWorkingHours(final DayOfWeek currentDay) {
        int sum = 0;
        DayOfWeek[] days = DayOfWeek.values();
        System.out.println(Arrays.toString(days));
        for (int i = currentDay.ordinal(); i < days.length; i++) {
            sum += days[i].hour;
        }

        return sum;
    }
}

enum DayOfWeek {
    MONDAY(8),
    TUESDAY(8),
    WEDNESDAY(8),
    THURSDAY(8),
    FRIDAY(7),
    SATURDAY(0),
    SUNDAY(0);

    public int hour;

    DayOfWeek(int hour) {
        this.hour = hour;
    }
}