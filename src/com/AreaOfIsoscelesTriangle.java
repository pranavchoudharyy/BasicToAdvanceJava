package com;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base of triangle(in cm) : ");
        double b = scan.nextDouble();
        System.out.println("Enter the dimension of equal sides of triangle(in cm) : ");
        double a = scan.nextDouble();
        double calc = Math.pow(a,2)-(Math.pow(b,2))/4;
        double h = Math.sqrt(calc);
        double area = .5f*b*h;
        System.out.println("Area of Isosceles triangle with both side given is : "+area);
    }
}
