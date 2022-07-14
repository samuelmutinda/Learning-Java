package com.samuel;

public class ForLoopsInJava {
    public static void main(String[] args) {
        //=> Loops allow us to repeat a block of code for a specified
        //   number of times.
        //=> Structure: A loop that will run 5 times
        for(int i = 0; i<5; i++){
            System.out.println("I have run "+(i+1)+" time(s) now");
        }

        //=> Enhanced for loop:
        //=> Say we want to loop through an array called numbers:
        int [] numbers = {1, 2, 3, 4};
        //=> We want to display each element
        for (int number : numbers){
            System.out.println(number);
        }

                //Bonus tip!
        //=> Intellij can write the loop for us. We just type
        //   "numbers.for" then we get an option to auto create a loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("This was automatically generated");
        }
    }
}
