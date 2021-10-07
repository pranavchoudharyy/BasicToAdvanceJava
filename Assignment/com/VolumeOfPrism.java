package com;

import java.util.Scanner;

public class VolumeOfPrism
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base area of Prism : ");
        double baseArea = scan.nextDouble();
        System.out.println("Enter the height of Prism(in cm): ");
        double height = scan.nextDouble();
        double volume = baseArea*height;
        System.out.println("Volume of prism with base area "+baseArea+" and height "+height+"cm is : "+volume);


    }
}
