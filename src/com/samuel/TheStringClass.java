package com.samuel;

public class TheStringClass {
    public static void main(String[] args) {
        //=> The String class is an inbuilt class that allows for a
        //   reference type String that is a series of characters.
        //=> We have access to attributes of the type in the class.
        //=> An instance of String
        String myName = new String("Samuel Mutinda");
        System.out.println("My name is "+myName);
        //=> Some behaviors.
        //=> Behaviors are called methods.
        System.out.println("My name in capital is "+myName.toUpperCase());
        System.out.println("The first char in my name is "+myName.charAt(0));
        System.out.println("My name contains \"Mutinda\": "
                +myName.contains("Mutinda"));
        String samuel = "Samuel";
        System.out.println("My name contains \""+samuel+"\": "
                            +myName.contains(samuel));
        System.out.println("My name is equal to \""+samuel+"\" only: "+
                            myName.equals(samuel));
    }
}
