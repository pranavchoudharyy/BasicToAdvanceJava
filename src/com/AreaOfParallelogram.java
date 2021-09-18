package com;

import java.util.Scanner;

public class AreaOfParallelogram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base of Parallelogram : ");
        double b = scan.nextDouble();
        System.out.println("Enter the vertical height of Parallelogram : ");
        double h = scan.nextDouble();
        double area = b*h;
        System.out.println("Area of Parallelogram is : "+area);
    }
}
