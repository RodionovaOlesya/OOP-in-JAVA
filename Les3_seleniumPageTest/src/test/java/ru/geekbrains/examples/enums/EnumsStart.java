package ru.geekbrains.examples.enums;

public class EnumsStart {

    public static void main(String[] args) {
        System.out.println(Calendar.isDayIsWorkingDay(DaysOfWeek.MONDAY));
        System.out.println(Calendar.isDayIsWorkingDay(DaysOfWeek.SUNDAY));
    }
}


class Calendar {

    public static boolean isDayIsWorkingDay(DaysOfWeek day) {
        if (day.equals(DaysOfWeek.SATURDAY) || day.equals(DaysOfWeek.SUNDAY)) {
            return false;
        } else {
            return true;
        }
    }
}

enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

