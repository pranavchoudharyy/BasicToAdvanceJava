package com;

import java.util.Scanner;

public class VolumeOfSphere
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of Sphere(in cm) : ");
        double radius = scan.nextDouble();
        double volume = 4/3f*3.14f*Math.pow(radius,3);
        System.out.println("Volume of Sphere with radius "+radius+"cm is :"+volume);

    }
}
