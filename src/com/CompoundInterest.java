package com;

import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Initial Principle Balance : ");
        double p = scan.nextDouble();
        System.out.println("Interest Rate(in percentage) : ");
        double r = scan.nextDouble();
        System.out.println("Number of times interest applied per time period : ");
        double n = scan.nextDouble();
        System.out.println("Overall Tenure(in year) : ");
        double t = scan.nextDouble();
        //Calculating Amount
        double amount = p*Math.pow((1+r/100),n*t);
        System.out.println("Final Amount is  : "+amount);
        //Calculating Compound Interest
        double ci = amount-p;
        System.out.println("Compound interest is : "+ci);

    }
}
