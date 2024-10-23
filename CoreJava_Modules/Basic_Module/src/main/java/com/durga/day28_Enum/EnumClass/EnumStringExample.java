package com.durga.day28_Enum.EnumClass;

/**
 * @author Durganaresh - 10/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class EnumStringExample {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println("Today is " + today.getDisplayName()); // Output: Today is Friday
    }
}

enum Day {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String displayName;

    private Day(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
