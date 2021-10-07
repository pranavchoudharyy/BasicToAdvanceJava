package com;

import java.util.Scanner;

public class AreaOfRectangle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter breadth and length respectively : ");
        double breadth = scan.nextDouble();
        double length = scan.nextDouble();
        double area = breadth*length;
        System.out.println("Area of rectangle is : "+area);
    }
}
