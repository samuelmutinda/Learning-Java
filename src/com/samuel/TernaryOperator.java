package com.samuel;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 18;
        //=> We can perform a full if operation in a single statement
        String message = age<18 ? "You are not an adult" : "You are an adult";
        System.out.println(message);
    }
}
