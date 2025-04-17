package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main (String [] args) {
        short [] testScores = {100, 94, 39, 58, 63, 56, 76, 66, 90, 88};
        short average = (short) ((testScores [0] + testScores [1] + testScores [2] + testScores [3] + testScores [4] + testScores [5] + testScores [6] + testScores [7] + testScores [8] + testScores [9])/10);

        // The way I knew how -----------------------------------------------------------------------------------------
        int winnerActual = getWinnerActual(testScores);
        int loser = Math.min(testScores[0], testScores[1]);
        int loserTwo = Math.min(testScores[2], testScores[3]);
        int loserThree = Math.min(testScores[4], testScores[5]);
        int loserFour = Math.min(testScores[6], testScores[7]);
        int loserFive = Math.min(testScores[8], testScores[9]);
        int nextLoser = Math.min(Math.min(loser, loserTwo), loserThree);
        int nextLoserTwo = Math.min(loserFive, loserFour);
        int loserActual = Math.min(nextLoser, nextLoserTwo);

        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + winnerActual);
        System.out.println("Lowest Score: " + loserActual);

        //Chat GPT Suggestion -----------------------------------------------------------------------------------------
        Arrays.sort(testScores);
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }

        double median;
        int middle = testScores.length/2;
        if (middle%2 == 0) {
            median = (testScores[middle - 1] + testScores[middle])/2;
        } else {
            median = testScores[middle];
        }

        double avg = sum/ testScores.length;
        int highScore = testScores [testScores.length-1];
        int lowScore = testScores [0];

        System.out.println("--------------------------------");
        System.out.println("ChatGPT Results");
        System.out.println("Highest Score: " + highScore);
        System.out.println("Lowest Score: " + lowScore);
        System.out.println("Average: " + avg);
        System.out.println("Median: " + median);

    }

    private static int getWinnerActual(short[] testScores) {
        int winner = Math.max(testScores[0], testScores[1]);
        int winnerTwo = Math.max(testScores[2], testScores[3]);
        int winnerThree = Math.max(testScores[4], testScores[5]);
        int winnerFour = Math.max(testScores[6], testScores[7]);
        int winnerFive = Math.max(testScores[8], testScores[9]);
        int nextWinner = Math.max(winner, winnerTwo);
        int nextWinnerTwo = Math.max(Math.max(winnerThree, winnerFour), winnerFive);
        int winnerActual = Math.max(nextWinner, nextWinnerTwo);
        return winnerActual;
    }
}
