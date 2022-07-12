package com.samuel;

public class ComparisonOperators {
    public static void main(String[] args) {
        //=> Allow us to compare values
        int samAge = 19;
        int alexAge = 21;
        boolean isSamOlderThanAlex = samAge > alexAge;
        System.out.println("Is sam older? "+isSamOlderThanAlex);
        System.out.println("Is alex younger? "+(samAge < alexAge));
        System.out.println("Are sam and alex agemates? "+(samAge == alexAge));
        System.out.println("Sam and alex are not agemates: "+(samAge!=alexAge));
    }
}
