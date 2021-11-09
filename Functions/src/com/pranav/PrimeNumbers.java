package com.pranav;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the two numbers : ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        Prime(start, end);
    }
    static void Prime(int p, int q)
    {   if(p==1)
        {
            p++;
        }
        for(int j=p;j<=q;j++)
        {
            int flag = 0;
            for(int i=2;i<=j/2;i++)
            {
                if(j%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(j);
            }
        }
    }
}
