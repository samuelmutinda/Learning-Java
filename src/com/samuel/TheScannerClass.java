package com.samuel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TheScannerClass {
    public static void main(String[] args) {
        //=> Allows us to take user input from the console
        //=> Start by creating a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        //=> The scanner will take the next string input
        //   into the cosole.
        String userName = scanner.nextLine();
        System.out.println("Hello "+userName);

        //=> Similarly, we can take integer input. The scanner
        //   will take the next integer input to the console
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        int birthYear = LocalDate.now().minusYears(age).getYear();
        System.out.println("You are "+age+" years old");
        System.out.println("You were born in "+birthYear);
        if (age<18){
            System.out.println("You are not an adult");
        }
        else {
            System.out.println("You are an adult");
        }
    }
}
