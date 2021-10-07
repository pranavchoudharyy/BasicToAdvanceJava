package com;

import java.util.Scanner;

public class CommissionPercentage
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Base Salary : ");
        double baseSalary = scan.nextDouble();
        System.out.println("Input Advance Pay ( if any , otherwise 0) : ");
        double advance = scan.nextDouble();
        System.out.println("Input Average gross Profit or Sales Revenue : ");
        double salesRevenue = scan.nextDouble();
        System.out.println("Income : ");
        double income = scan.nextDouble();
        double commissionPercentage = (income-baseSalary+advance)/salesRevenue;
        System.out.println("Commission Percentage is : "+commissionPercentage*100+"%");
    }
}
