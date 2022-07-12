package com.samuel;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int ten = 10;
        int two = 2;
        //=> sum
        int sum = ten + two;
        System.out.println("sum is "+sum);
        //=> Subtract
        System.out.println("10 - 2 is is "+(ten-two));
        //=> Product
        System.out.println("10 * 2 is "+(ten*two));
        //=> Division
        System.out.println("10/2 is "+(ten/two));
        //=> Power
        System.out.println("10 to power 2 is "+(ten^two));
        //=> Modulus
        System.out.println("10 modulus 2 is is "+(ten%two));
        //=> Modulus
        System.out.println("2 modulus 10 is is "+(two%ten));
    }
}
