package com;

import java.util.Scanner;

public class AreaOfEquilateralTriangle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of equilateral triangle(in cm) :");
        double s = scan.nextDouble();
        double area = .25f*Math.sqrt(3)*Math.pow(s,2);
        System.out.println("Area of equilateral triangle with side "+s+" is : "+area);

    }
}
