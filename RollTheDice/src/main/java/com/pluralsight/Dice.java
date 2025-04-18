package com.pluralsight;

public class Dice {

    public static void main (String [] args) {
        Dice dice = new Dice();
        int rollOne = 0;
        int rollTwo = 0;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        int index = 1;

        while (index != 101) {
            rollOne = Dice.roll(1,6);
            rollTwo = Dice.roll(1,6);
            System.out.println("Roll " + index + ": " + rollOne + " - " + rollTwo + " Sum: " + (rollOne+rollTwo));


            if (rollTwo + rollOne == 2) {
                twoCounter += 1;
                System.out.println("\nTwo Counter: " + twoCounter);
                System.out.println();
            } if (rollTwo + rollOne == 4) {
                fourCounter += 1;
                System.out.println("\nFour Counter: " + fourCounter);
                System.out.println();
            } if (rollTwo + rollOne == 6) {
                sixCounter += 1;
                System.out.println("\nSix Counter: " + sixCounter);
                System.out.println();
            } if (rollTwo + rollOne == 7) {
                sevenCounter += 1;
                System.out.println("\nSeven Counter: " + sevenCounter);
                System.out.println();
            }
            index += 1;
        }

        System.out.println("\n----------------------------------------");
        System.out.println("Final Results:");
        System.out.println("\nTwo Counter: " + twoCounter);
        System.out.println("\nFour Counter: " + fourCounter);
        System.out.println("\nSix Counter: " + sixCounter);
        System.out.println("\nSeven Counter: " + sevenCounter);
        System.out.println("----------------------------------------");


    }

    public static int roll (int min, int max) {
        int randomNumber = (int)(Math.random() * max) + min;
        return randomNumber;
    }


}
