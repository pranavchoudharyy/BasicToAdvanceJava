package com;

import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        int sum = 0;
        while(num!=0)
        {
            int rem = num%10;
            sum += rem;
            num /= 10;
        }
        System.out.println(sum);
    }
}
