package com.samuel;

public class ClassesInJava {
    //=> A class is a blueprint for creating things. It is an important concept
    //   in a programming paradigm called object-oriented programming
    //=> Classes allow us to create user defined types and introduce abstraction,
    //   inheritance and polymorphism.
    //=> Abstraction means we can modularize our code even more. Not just
    //   through methods. Abstraction allows us to write cleaner code.
    //=> You might need to create your own types for several reasons, just as
    //   you may want to create your own methods.
    //=> In java, a class can have child classes. The parent class therefore
    //   behaves as the blueprint.
    //=> Analogy: Apple makes the iPhone 13. The iPhone 13 is the blueprint.
    //   It is the parent class. The models of the iPhone 13(13 mini, 13 pro)
    //   are the child classes. They are under the same blueprint, but they
    //   behave differently from one another. When a class(child class) derives
    //   from another class(Parent class), this is called inheritance. When child
    //   classes behave differently from one another, we call that polymorphism.

    public static void main(String[] args) {
        //=> We can now create a new lens.
        //=> We call a new lens an "object"
        //=> We can call multiple lenses
        //=> We pass attributes of the lens to the constructor when we
        //   create the object.
        Lens lensOne = new Lens(
                "Sony",
                "85mm",
                true);
        Lens lensTwo = new Lens(
                "Sony",
                "30mm",
                true);
        Lens lensThree = new Lens(
                "Canon",
                "30mm",
                false);

                            //PRINTING OBJECT ATTRIBUTES
        System.out.println("Lens 1:");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println("Prime: "+lensOne.isPrime+"\n");

        System.out.println("Lens 2:");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println("Prime: "+lensTwo.isPrime+"\n");

        System.out.println("Lens 3:");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println("Prime: "+lensThree.isPrime);
    }
    static class Lens{
        String brand;
        String focalLength;
        String model;
        String color;
        double price;
        double weight;
        boolean isPrime;
        //=> The constructor is a special function with the name of the class
        //=> The purpose of the constructor is to initialize objects.
        //=> The constructor is called when an object of the class is created.
        //=> It can be used to set initial values for object attributes.
        Lens(String brand, String focalLength, boolean isPrime){
            //=> "this" keyword refers to the current instance of the attribute
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
