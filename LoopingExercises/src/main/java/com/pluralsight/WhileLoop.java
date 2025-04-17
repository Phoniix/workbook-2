package com.pluralsight;

public class WhileLoop {

    public static void main (String [] args) {
        boolean confirmed = false;
        int counter = 0;

        while (!confirmed) {
            System.out.println("I love Java");
            counter += 1;
            if (counter == 5) {
                break;
            }
        }


    }

}
