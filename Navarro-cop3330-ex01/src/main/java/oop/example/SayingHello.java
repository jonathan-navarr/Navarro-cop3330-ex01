package oop.example;
import java.util.Scanner;

public class SayingHello {
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is your name?");
        String birthName = scnr.nextLine();
        System.out.println("Hello, " + birthName + ", nice to meet you!");
    }
}