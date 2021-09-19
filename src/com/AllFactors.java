package com;

import java.util.Scanner;

public class AllFactors
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number : ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
