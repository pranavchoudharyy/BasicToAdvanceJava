package com;

import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scan.nextInt();
        int temp = n;
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            sum = (int)(sum+Math.pow(rem,3));
            n /= 10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }


}
