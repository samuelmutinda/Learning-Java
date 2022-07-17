package com.samuel;

import java.time.LocalDate;

public class PassportExample {
    public static void main(String[] args) {
        Passport ukPassport = new Passport(
                "1234",
                LocalDate.of(2025, 1, 1),
                "England (UK)");
        Passport usPassport = new Passport(
                "1299",
                LocalDate.of(2027, 2, 3),
                "USA");
    }

    public static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, LocalDate expiryDate, String country){
            this.number = number;
            this.expiryDate = expiryDate;
            this.country = country;
        }
    }
}
