package com.example.project;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("guess a number from 0 to 100 ");
        int number = scan.nextInt();
        int random = (int)(Math.random() * 100);

        // (int) (Math.random() * (upper - lower) + lower);

        while(number != random){
            if(number > random){
                System.out.println("Too high!");
            }
            if(number < random){
                System.out.println("Too low!");
            }
            number = scan.nextInt();
        }
            System.out.println("You got it!");

        // Ask the user to guess a number from 0 to 100
        // Get the first guess using scan.nextInt();


        // Loop while the guess does not equal the random number,

        // If the guess is less than the random number, print out "Too low!"

        // If the guess is greater than the random number, print out "Too high!"

        // Get a new guess (save it into the same variable)

        // Print out "You got it!"


    }
}