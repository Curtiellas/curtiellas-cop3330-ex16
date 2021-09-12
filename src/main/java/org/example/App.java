package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //16 years or older
        final int threshold = 16;

        System.out.println("What is your age? ");

        //check inout without saving it to a variable
        if (sc.nextInt() >= threshold)
            System.out.println("You are old enough to legally drive.\n");

        else
            System.out.println("You are not old enough to legally drive.\n");

    }
}
