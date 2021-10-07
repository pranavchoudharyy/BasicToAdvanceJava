package com;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number : ");
        int n = scan.nextInt();
        int fact = 1;
        if(n==0 || n==1){
            System.out.println("Factorial of "+n+" is : "+fact);
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                fact = fact*i;
            }
            System.out.println("Factorial of "+n+" is : "+fact);
        }


    }
}
