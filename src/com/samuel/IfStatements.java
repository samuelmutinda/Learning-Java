package com.samuel;

public class IfStatements {
    public static void main(String[] args) {
        int age = 17;
        if (age>=18){
            System.out.println("You are an adult");
        }
        else if (age>=13 && age<18){
            System.out.println("You are an teenager");
        }
        else {
            System.out.println("You are a child");
        }
    }
}
