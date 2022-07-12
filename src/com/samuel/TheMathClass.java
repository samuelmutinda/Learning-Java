package com.samuel;

public class TheMathClass {
    public static void main(String[] args) {
        //=> The Math class from java.lang package allows
        //   us to perform advanced math operations by
        //   calling the methods in the class.
        //=> We can use the abs method to make a negative
        //   integer positive
        System.out.println(Math.abs(-2));
        //=> max method:
        System.out.println("Between 1 and 2, "+Math.max(1, 2)+" is larger");
        //=> pow method:
        System.out.println("5^2 is "+Math.pow(5, 2));
        //=> We can print the result as an integer:
        System.out.println("5^2 is "+(int) Math.pow(5, 2));
        //=> sqrt method:
        System.out.println("Square root of 25 is "+(int) Math.sqrt(25));
        //=> There are many more methods that can be explored including
        //   getting the exact values of constants like pi
    }
}
