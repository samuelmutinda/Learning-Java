package com.samuel;

//=> From the java.util package, give me the Date class
import java.time.LocalDate;
//=> From the java.time package, give me the LocalDateTime class
import java.time.LocalDateTime;
//=> From the java.time package, give me the Date class
import java.util.Date;

public class PackagesAndImportKeyword {
    public static void main(String[] args) {
        //=> Package keyword tells us that we are in com.samuel
        //=> If we attempt typing Date, intellij adds the line
        //   import java.util.Date to our code.
        //=> JDK comes with multiple packages for working with dates:
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        //=> For Strings we also have java.lang which does not need an
        //   import
        String s = new String("This is my string");
        //=> We can do in line imports:
        //   java.time.LocalDateTime localDateTime1 =
        //   new java.time.LocalDateTime()
        //=> We might want to do this for example when we want
        //   to use two different packages that have a class of
        //   the exact same name
        java.sql.Date sqlDate = new java.sql.Date(1);
    }
}
