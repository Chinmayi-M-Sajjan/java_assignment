package com.tricon.basic.enums;

public class Enums {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Weekend is coming!");
                break;
            case SUNDAY:
                System.out.println("It’s a relaxing day!");
                break;
            default:
                System.out.println("It's a regular weekday.");
        }
        System.out.println("\nAll Days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
