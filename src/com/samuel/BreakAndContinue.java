package com.samuel;

public class BreakAndContinue {
    public static void main(String[] args) {
        //=> We have an array of strings
        String [] names = {"charles", "carlos", "max", "checo"};

        //=> Say we want to loop through the elements then stop when
        //   we get to "max"
        System.out.println("BREAK KEYWORD");
        for (int i = 0; i < names.length; i++) {
            if (names[i] == "max"){
                break;
            }
            System.out.println(names[i]);
        }

        //=> If we want to keep looping, but we want to skip "max"
        //   we can use the "continue" keyword.
        System.out.println("\nCONTINUE KEYWORD");
        for (int i = 0; i < names.length; i++) {
            if(names[i] == "max"){
                continue;
            }
            System.out.println(names[i]);
        }
    }
}
