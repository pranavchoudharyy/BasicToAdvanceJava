package com;

import java.util.Scanner;

public class VolumeOfPyramid
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base area of Pyramid : ");
        double baseArea = scan.nextDouble();
        System.out.println("Enter the height of Pyramid(in cm): ");
        double height = scan.nextDouble();
        double volume = 1/3f*baseArea*height;
        System.out.println("Volume of Pyramid with base area "+baseArea+" and height "+height+"cm is : "+volume);



    }
}
