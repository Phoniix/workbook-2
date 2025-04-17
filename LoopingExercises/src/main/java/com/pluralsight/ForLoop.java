package com.pluralsight;

public class ForLoop {

    public static void  main (String [] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Countdown starting from 10:");
        for (int index = 10; index > -1; index -= 1) {
            System.out.println(index);
            if (index == 0) {
                System.out.println("LAUNCH!");
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Y");
            }

        }
    }

}
