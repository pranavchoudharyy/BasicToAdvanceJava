package com;

import java.util.Scanner;

public class DistanceBetweenTwoPoints
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("X1 is ");
        double x1 = scan.nextDouble();
        System.out.println("Y1 is ");
        double y1 = scan.nextDouble();
        System.out.println("X2 is ");
        double x2 = scan.nextDouble();
        System.out.println("Y2 is ");
        double y2 = scan.nextDouble();
        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Distance between two points is : "+distance);
    }
}
