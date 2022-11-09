package com.javaprogram;

import java.util.*;

public class Practice {
    // Primitive Data Types
    boolean b;
    char c;
    byte by;
    short s;
    int i;
    long l;
    float f;
    double d;

    public static void main(String[] args) {
        // Display Of A Message
        System.out.println("Welcome to Java Programs!!");

        // Creating A Object Of The Class
        Practice demo = new Practice();

        // Displaying All Primitive Data Types
        System.out.println("Default value of Boolean  : " + demo.b);
        System.out.println("Default value of Character: " + demo.c);
        System.out.println("Default value of Byte     : " + demo.by);
        System.out.println("Default value of Short    : " + demo.s);
        System.out.println("Default value of Int      : " + demo.i);
        System.out.println("Default value of Long     : " + demo.l);
        System.out.println("Default value of Float    : " + demo.f);
        System.out.println("Default value of Double   : " + demo.d);

        // To Check Two String Equal Or Not
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String s1 = a.nextLine();
        System.out.println("Enter the First String: ");
        String s2 = a.nextLine();
        if (s1.compareTo(s2) == 0) {
            System.out.println("Given String Are Equal");
        } else {
            System.err.println("Given String Are Not Equal");
        }

        // To Sum The Command Line Arguments And Count The Invalid Integers Entered

        int sum = 0;
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                count++;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("Number of invalid integers = " + count);

        // Command Line Argument For Displaying Name

        for (int i = 0; i < args.length; i++)
            System.out.print(args[i]);
    }
}
