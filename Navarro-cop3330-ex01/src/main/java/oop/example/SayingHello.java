package oop.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */

public class SayingHello {
    public static void main(String[] args)
    {

        Scanner scnr = new Scanner(System.in);
        System.out.print("What is your name?");
        String birthName = scnr.nextLine();
        System.out.println("Hello, " + birthName + ", nice to meet you!");
    }
}