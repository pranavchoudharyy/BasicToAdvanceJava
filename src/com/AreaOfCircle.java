package com;
import java.util.Scanner;

public class AreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius of Circle : ");
        double radius = scan.nextFloat();
        float pi = 3.14f;
        double area = pi*Math.pow(radius,2);
        System.out.println("Area of Circle is : "+area);
    }
}
