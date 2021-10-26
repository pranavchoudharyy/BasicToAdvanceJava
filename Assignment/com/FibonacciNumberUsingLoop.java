package com;

import java.util.Scanner;

public class FibonacciNumberUsingLoop
{
    public static void main(String[] args) {
        int a =0;
        int b =1;
        int count = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("which fibonacci term you want : ");
        int n = scan.nextInt();
        if(n==0)
        {
         b=0;
        }
        while(n>=count)
        {
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }

        System.out.println(b);

    }
}
