package com;

import java.util.Scanner;

public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base and height of triangle : ");
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        double area = 0.5f*b*h;
        System.out.println("Area of Triangle is : "+area);

    }
}
