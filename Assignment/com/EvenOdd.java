package com;

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        a = input.nextInt();
        if(a%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }

    }





}
