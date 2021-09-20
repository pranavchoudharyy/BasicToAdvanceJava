package com;

import java.util.Scanner;

public class Average
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("input how many numbers you want to average : ");
        int n = scan.nextInt();
        int sum =0;
        for (int i=1;i<=n;i++)
        {
            System.out.println("input "+i+"th number");
            int input = scan.nextInt();
            sum = sum + input;
        }
        double avg = (double)sum/(double)n;
        System.out.println("Average of "+n+" inputted numbers is "+avg);

    }
}
