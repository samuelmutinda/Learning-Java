package com.samuel;

import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        //=> Arrays are data structures that allow us to store multiple
        //   values inside one variable.
        //=> Declaring an array (Specify the data type to be stored in
        //   the array and also mention the number of elements to be
        //   stored inside the array)
        //=> An empty array of 5 integers:
        int [] numbers = new int[5];
        //=> Array sizes are immutable
        //=> Adding values into the array
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        //=> If we want to print an array:
        System.out.println(Arrays.toString(numbers));
        //=> We can declare an array and assign values
        //   in a single line.
        String [] animals = {"cow", "dog", "cat"};
        System.out.println(Arrays.toString(animals));
        //=> We can find the size of an array
        System.out.println("The size of animals array is "+animals.length);

        //=> In order to access elements in an array, mention its index:
        System.out.println("The element in index 2 of animals is "+numbers[2]);

        //=> Increment(++) and Decrement(--)
        int number = 1;
        number++;
        System.out.println("number was 1. It is now "+number);
        number = 3;
        number--;
        System.out.println("number was 3. It is now "+number);

        //=> Similarly, we can do += and -+
        number = 5;
        number += 1;
        System.out.println("Number was 5. It is now "+number);
        number -= 1;
        System.out.println("Number was 6. It is now "+number);
    }
}
