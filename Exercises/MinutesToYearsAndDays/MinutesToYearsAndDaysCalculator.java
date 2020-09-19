package Exercises.MinutesToYearsAndDays;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long totalDays = (minutes / 60 / 24);
            int years = (int)(totalDays / 365);
            int remainingDays = (int)(totalDays % 365);
            System.out.println(minutes + " min = " + years + 
                " y and " + remainingDays + " d");
        }
    }
}
