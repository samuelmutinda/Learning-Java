package com.samuel;

public class DoWhileLoopsInJava {
    public static void main(String[] args) {
        //=> A do while loop executes the code in the brackets first
        //   then checks the condition after every iteration. The
        //   loop terminates after the condition goes to false
        //=> Syntax:
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }
        while(a<5);
    }
}
