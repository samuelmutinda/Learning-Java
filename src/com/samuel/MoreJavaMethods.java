package com.samuel;

public class MoreJavaMethods {
    public static void main(String[] args) {
        //=> Let us assume that we want to determine the number of
        //   times a letter is repeated in an array.
        //=> We can do this inside the main method, but this is not
        //   ideal because we may want to reuse the same logic
        //   somewhere else in our code.
        //=> The best option is to create a method outside the main method
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        System.out.println("'A' is repeated "+countOccurrences(letters, 'A')
                            +" times");
    }
    //=> Public is an access modifier. It specifies that the method is
    //   accessible anywhere, inside this package or inside another package
    //=> Static means that we do not need to create an object in order
    //   to call this method.
    //=> Int specifies the return type of the method.
    //=> This method will accept an array of characters and
    //   the character we need to find count of
    public static int countOccurrences(char[] letters, char letter){
        int count = 0;
        int letterCount = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == letter){
                letterCount++;
            }
        }
        return letterCount;
    }
}
