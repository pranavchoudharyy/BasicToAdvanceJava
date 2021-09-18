package com;

import java.util.Scanner;
//this is an example of Switch Statements Case Statements
public class Switch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Fruit name");
        String fruit = scan.next();

        switch(fruit)
        {
            case "Mango" :
                System.out.println("King of Fruits");
                break;

            case "Apple" :
                System.out.println("Red fruit");
                break;

            default:
                System.out.println("it is a fruit");
                break;
        }


    }
}
