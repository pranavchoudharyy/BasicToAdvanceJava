package com;

import java.util.Scanner;

public class AreaOfRhombus
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of diagonal 1(in cm) : ");
        double d1 = scan.nextDouble();
        System.out.println("Enter the value of diagonal 2(in cm) : ");
        double d2 = scan.nextDouble();
        double area = .5f*d1*d2;
        System.out.println("Area of Rhombus is : "+area);


    }
}
