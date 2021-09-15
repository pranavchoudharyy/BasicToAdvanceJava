package com;

import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args)
    {
        int a , b;
        Scanner scan = new Scanner(System.in);
        System.out.println("First Number :");
        a= scan.nextInt();
        System.out.println("Second Number :");
        b = scan.nextInt();
        if(a<b)
        {
            System.out.println("Larger number is : "+b);
        }
        else{
            System.out.println("Larger number is : "+a);
        }


    }
}
