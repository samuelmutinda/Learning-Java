package com.samuel;

public class SwitchStatements {
    public static void main(String[] args) {
        String gender = "FEMALE";
        //=> Let us check if gender is male, female or prefer not to say
        switch (gender){
            case "FEMALE":
                System.out.println("You are a female");
                break;
            case "MALE":
                System.out.println("You are a male");
                break;
            case "PREFER NOT TO SAY":
                System.out.println("Prefer not to say");
                break;
            default:
                System.out.println("Unknown gender");
        }

    }
}
