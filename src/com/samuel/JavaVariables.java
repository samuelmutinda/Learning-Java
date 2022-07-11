package com.samuel;

public class JavaVariables {
    public static void main(String[] args) {
        //=> A variable is a location in memory where some data is stored
        //=> In java, variables act as containers to store data such as
        //   characters, sentences or numbers
        //=> When specifying a variable, you must specify the type
        //   data that the variable will hold.
        //=> All variables (apart from arrays) only hold a single value.
        //=> Java has two types of variables:
        //      1. Primitive variables (int, long, double).
        //      2. Reference types/objects.
        //=>Let us create some variables

                                //PRIMITIVE TYPES:
        //A variable called "a" holding an 8-bit number (-128 to 127)
        byte a = 5;
        //A variable called "b" holding a 16-bit number (-32,768 to 32,767)
        short b = 32_000;
        //A variable called "c" holding a 32-bit number
        int c = 34_000;
        //A variable called "d" holding a 64-bit number
        long d = 9_000_000_000L;
        //A variable called "decimal1" holding a 32-bit decimal (up to 7d.p)
        float decimal1 = 3.14F;
        //A variable called "decimal2" holding a 64-bit decimal (up to 15d.p)
        double decimal2 = 3.14159265;
        //A variable called "name" holding a String data type
        String name = "My name is samuel";
        System.out.println("The value in a is => "+a);
        System.out.println("The value in b is => "+b);
        System.out.println("The value in c is => "+c);
        System.out.println("The value in d is => "+d);
        System.out.println("The value in name is => "+name);

        //=> When we give a variable the value of another variable
        //   the value is copied to the other variable. Any changes to the
        //   original variable after copying do not affect the new variable
        int copyExperiment = a;
        System.out.println("Before:");
        System.out.println("The value of a is "+ a +" and that of " +
                "copyExperiment is " + copyExperiment);
        a = 10;
        System.out.println("Changes made to a");
        System.out.println("The value of a is now "+ a +" and that of " +
                "copyExperiment is " + copyExperiment);

                                //REFERENCE TYPES:
        //=> Reference types always start with capitals
        //=> A reference called myString of the String reference type (type)
        String myString = new String("This is my string");

        //=> Reference types have different behaviors and attributes
        //=> For example, in the String reference type, we have a length()
        //   attribute that gives us the length of the string.
        System.out.println("The length of myString is " + myString.length());

        //=> String is a built-in ref type.
        //=> We can however build our own ref types.
        //=> The person ref type is defined outside the main method
        //=> Let us create a reference type called sam of the Person type
        Person sam = new Person("sam");
        //=> We access the personName attribute of sam using sam.personName
        System.out.println("The name of the Person sam is "+sam.personName);

        //=> Let us create a new Person called alex and point him to the attributes
        //   of sam. Alex will always refer to the attributes of sam.
        //=> This means that if any attribute of sam is changed, the changes are
        //   to alex.
        Person alex = sam;
        System.out.println("Before sam is changed, sam's name is \""+sam.personName
                            +"\" and that of alex is \""+alex.personName+"\"");
        sam.personName = "New name";
        System.out.println("After sam is changed, sam's name is \""+sam.personName
                +"\" and that of alex is \""+alex.personName+"\"");
        //=> Similarly, changes on alex are reflected on sam
    }

    //PERSON REFERENCE TYPE
    static class Person {
        String personName;
        Person(String personName){
            this.personName = personName;
        }
    }
}
