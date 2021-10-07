package com;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scan.nextInt();
        int temp = n;
        int reverse = 0;
        while(n!=0)
        {
            int rem=n%10;
            reverse = reverse*10 + rem;
            n /= 10;
        }
        if (reverse==temp)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("not a Palindrome Number");
        }


    }
}
