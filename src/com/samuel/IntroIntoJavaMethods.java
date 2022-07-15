package com.samuel;

public class IntroIntoJavaMethods {
    public static void main(String[] args) {
        //=> Methods are blocks of code that only run when invoked.
        //=> We can pass data into methods using parameters.
        //=> We have builtin methods that are provided in the JRE.
        //=> We can also have use pre-defined methods that we can create.
        //=> System.out.println() is a builtin method. When we write
        //   the statement, we invoke the method. We also pass the string
        //   that we want to display into the parameters.
        System.out.println("Hello World!");
        //=> Another builtin method is toUpperCase() method
        String hello = "Hello world in uppercase";
        System.out.println(hello.toUpperCase());
        //=> Another builtin method is startsWith() method
        System.out.println("Does the string start with \"Hello\"? "
                        +hello.startsWith("Hello"));
        //=> The string class in Java allows us to have
    }
}
