package com;

import java.util.Scanner;

public class CombinationPermutation
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N : ");
        int n = scan.nextInt();
        System.out.println("Enter the R : ");
        int r = scan.nextInt();
        //Finding Combination
        int comb = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("Combination is "+comb);
        //Finding Permutation
        int permutation = factorial(n)/factorial(n-r);
        System.out.println("Permutation is : "+permutation);
    }
    //Finding Factorial
    static int factorial(int f)
    {
        int fact=1;
        if(f==0 || f==1)
        {
            return fact;
        }
        for(int i=1;i<=f;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
}
