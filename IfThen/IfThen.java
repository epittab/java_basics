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
        int secondTopScore = 60; // change to 81, for example, to invalidate conditional

        if (topScore > secondTopScore &&  topScore < 100 ) {
            System.out.println("Greater than second top score and less than 100.");
        }
    }
}