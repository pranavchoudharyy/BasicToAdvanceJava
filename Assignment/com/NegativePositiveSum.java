package com;

import java.util.Scanner;

public class NegativePositiveSum
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Enter 0 when you want to terminate ***");
        int sum = 0;
        int n;
        while(true)
        {
            System.out.println("Enter the number : ");
            n = scan.nextInt();
            if(n!=0)
            {
                sum += n;
            }
            if(n==0)
            {
             break;
            }
        }
        System.out.println("Sum is : "+sum);
    }
}
