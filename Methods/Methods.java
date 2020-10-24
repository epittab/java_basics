package com.Fundamentals.Methods;

public class Methods {
    public static void main(String[] args) {

        int gameScore = calculateScore(true, 800, 5, 100);
        int secondGameScore = calculateScore(true, 10000, 8, 200);

        displayHighScorePosition("Enrique", calculateHighScorePosition(1500));
        displayHighScorePosition("John", calculateHighScorePosition(900));
        displayHighScorePosition("Michael", calculateHighScorePosition(400));
        displayHighScorePosition("Anne", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if ( score > 1000) {
            return 1;
        } else if ( score > 500 ) {
            return 2;
        } else if ( score > 100 ) {
            return 3;
        } else {
            return 4;
        }
    }



}