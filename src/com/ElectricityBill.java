package com;

import java.util.Scanner;

public class ElectricityBill
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the Name of Consumer : ");
        String name = scan.next();
        System.out.println("Input the Gender of Consumer : ");
        char gender = scan.next().charAt(0);
        System.out.println("Please input the Units Consumed : ");
        double units = scan.nextDouble();
        System.out.println("Please input the rate per unit (in Rs.) in consumer area : ");
        double rate = scan.nextDouble();
        double bill = rate*units;
        if(gender=='M'){
            System.out.println("Electricity Bill for Mr. "+name+" is : "+bill);
        }
        else{
            System.out.println("Electricity Bill for Mrs. "+name+" is : "+bill);

        }

    }
}
