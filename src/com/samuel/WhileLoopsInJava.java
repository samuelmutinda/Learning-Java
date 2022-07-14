package com.samuel;

public class WhileLoopsInJava {
    public static void main(String[] args) {
        //=> The while loop repeats a block of code until a boolean value
        //   becomes false
        //=> Syntax: A while loop that will run until the value of "i" becomes
        //   greater than or equal to 5
        int i = 0;
        while (i<5){
            System.out.println(i);
            i++;
        }

        //=> We can create a while loop that never stops (infinite loop)
        //=> Commented out to prevent the loop from running forever
//        while (true){
//            System.out.println("I will run forever");
//        }
    }
}
