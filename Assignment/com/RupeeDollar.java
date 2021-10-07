package com;

import java.util.Scanner;

public class RupeeDollar
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Rupee : ");
        float a = scan.nextFloat();
        int b = (int)(a/73.50);
        System.out.println(a+" rupee in dollar is : "+b);
    }
}
