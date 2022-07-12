package com.samuel;

public class LogicalOperators {
    public static void main(String[] args) {
        //Logical operators allow us to combine boolean expressions
        boolean isAdult = false;
        boolean isStudent = true;
        //=> AND logic operator -> &&
        System.out.println("Am i both an adult and a student? "+
                (isAdult && isStudent));
        //=> OR logic operator -> ||
        System.out.println("Am i either an adult or a student? "
                            +(isAdult || isStudent));
        //=> We can nest boolean expressions
        boolean isSamuel = true;
        System.out.println("Am I Samuel and Am i either an adult " +
                "or a student? "+(isSamuel&&(isAdult || isStudent)));
        //=> INV logic operator
        System.out.println("I am not a student: "+!isStudent);
    }
}
