package dev.lpa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekday = DayOfTheWeek.TUES;
        System.out.println(weekday);


        for (int i = 0; i < 10; i++) {
            weekday = getRandomDay();

          //  System.out.printf("Name is %s, Ordinal Value = %d%n", weekday.name(), weekday.ordinal());
           switchDayOfWeek(weekday);
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay){
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInteger);

        }
    }

    public static DayOfTheWeek getRandomDay(){
        int randaomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randaomInteger];
    }
}
