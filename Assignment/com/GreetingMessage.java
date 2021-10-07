package com;

import java.util.Scanner;

public class GreetingMessage
{
    public static void main(String[] args)
    {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        name = input.next();
        System.out.println("Hello "+name+", Welcome to Java World");

    }
}
