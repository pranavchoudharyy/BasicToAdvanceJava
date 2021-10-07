package com;

import java.util.Scanner;

public class VolumeOfCylinder
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of Cylinder(in cm) : ");
        double radius = scan.nextDouble();
        System.out.println("Enter the height of Cylinder(in cm) : ");
        double height = scan.nextDouble();
        double volume = 3.14f*Math.pow(radius,2)*height;
        System.out.println("Volume of Cylinder with radius "+radius+"cm and height "+height+"cm is :"+volume);


    }
}
