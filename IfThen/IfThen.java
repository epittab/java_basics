package IfThen;

public class IfThen {

    public static void main(String[] args) {
        boolean isAlien = false;

        if (isAlien) {
            System.out.println("This is an alien.");
        } else {
            System.out.println("This is NOT an alien.");
        }

        int topScore = 80;
        int secondTopScore = 81; // change to 81, for example, to invalidate conditional

        if (topScore > secondTopScore && topScore < 100 ) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("Greater than second top score or less than 100.");
        }

        int newValue = 50;
        if ( newValue != 50 ) {
            System.out.println("This is an error.");
        }

        boolean isCar = false;

        boolean wasCar = !isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}