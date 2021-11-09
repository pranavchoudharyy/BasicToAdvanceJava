package com.pranav;

import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scan.nextInt();
        boolean flag = Palindrome(n);
        if(flag)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
    static boolean Palindrome(int n)
    {   int reverse = 0;
        int temp = n;
        boolean flag = false;
        while(n!=0)
        {
            int rem = n%10;
            reverse = reverse*10+rem;
            n/=10;
        }
        if(reverse==temp)
        {
            flag=true;
        }
        return flag;
    }

}
