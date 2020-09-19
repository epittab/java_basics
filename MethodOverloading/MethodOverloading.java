package MethodOverloading;

/**
 * MethodOverloading
 * is creating a method with the same name but 
 * different number of parameters
 * Note: Function definiton must not change - only parameters
 */
public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Time", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore( int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore( ) {
        System.out.println("No player name, no player score");
        return 0;
    }


}