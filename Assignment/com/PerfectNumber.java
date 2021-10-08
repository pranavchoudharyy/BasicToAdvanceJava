package com;

import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scan.nextInt();
        int sum = 0;
        for(int i=1;i<=number/2;i++)
        {
         if(number%i==0)
         {
             sum += i;
         }
        }
        if(sum==number){
            System.out.println("This number is perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
