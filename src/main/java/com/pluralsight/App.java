package com.pluralsight;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
       // Starting point of an app
        Scanner reader = new Scanner(System.in);
        Scanner Scanner = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);


        System.out.println("Welcome to U.S Bank");
        System.out.println("What is your name?");
        String name = Scanner.nextLine();

       // System.out.println(""); String username = reader.nextLine();

        int pincode = 1012;
        long balance = 20000245L;
        String formattedMoney = formatter.format(balance);
        String username = "Kay";
        System.out.println("Type in your PIN");
        int enteredPincode = reader.nextInt();

        int attempts = 3;
        long option1 = 1;
        long option2 = 2;
        if (enteredPincode == pincode) {
            System.out.println("Access granted. Welcome! " + username + " Your balance is " + formattedMoney);
            System.out.println("Pick an option");
            System.out.println("1. Balance");
            System.out.println("2. Withdraw 100 dollars");
            long choice = reader.nextInt();

            if (choice == option1) {
                System.out.println(formattedMoney);
            } else if (choice == option2) {
                balance = balance - 100;
                formattedMoney = formatter.format(balance);
                System.out.println( formattedMoney);
            } else {
                System.out.println("Invalid option");
            }
        }
         else {
            System.out.println("Access denied. Incorrect PIN");
            attempts--;
            System.out.println("You only have" + attempts + "attempts left");
            int enteredPin = 0;
            while (attempts > 0 && enteredPin != pincode) {
                System.out.println("Please enter your PIN");
                enteredPin = Scanner.nextInt();
                if (enteredPin ==pincode) {
                    System.out.println(name + "Access granted. Welcome!" + "Your balance is" + formattedMoney);
                }
                else {
                    System.out.println(name + "Access denied. Incorrect PIN.");
                    attempts--;
                    System.out.println("You only have" + attempts + "attempts left");
                }
            }
         }


        Scanner.close();
    }
}
