package com.pranav;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        int factorial = Fact(num);
        System.out.println("Factorial of "+num+" is : "+factorial);

    }
    static int Fact(int n)
    {   int fact = 1;
        if(n>1)
        {
            for(int i = 2; i<=n ;i++)
            {
                fact = fact*i;
            }
        }
        return fact;
    }
}
