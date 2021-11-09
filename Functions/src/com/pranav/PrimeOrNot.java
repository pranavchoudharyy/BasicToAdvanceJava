package com.pranav;

import java.util.Scanner;

public class PrimeOrNot
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scan.nextInt();
        Prime(n);
    }
    static void Prime(int num)
    {
        int flag = 0;
        for(int i = 2 ; i<=num/2 ; i++)
        {
            if(num%i==0){
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Not a Prime Number");
        }
        else
        {
            System.out.println("Prime Number");
        }
    }
}
