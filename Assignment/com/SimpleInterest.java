package com;

import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        int p,r,t,si;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principle (in Rupees) : ");
        p = scan.nextInt();
        System.out.println("Enter the Time Period (in Years) : ");
        t = scan.nextInt();
        System.out.println("Enter the Rate of Interest (in Percentage) : ");
        r = scan.nextInt();
        si = p*r*t/100;
        System.out.println("Simple Interest for "+p+" at Rate "+r+" for "+t+" years is "+si+" Rs.");

    }


}
