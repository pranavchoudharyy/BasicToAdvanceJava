package com;

import java.util.Scanner;

public class DiscountOfProduct
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the product name : ");
        String name = scan.next();
        System.out.println("Enter the Selling Price : ");
        double sp = scan.nextDouble();
        System.out.println("Enter the Discount Percentage ");
        double disc = scan.nextDouble();
        double discountedprice = sp - sp*disc/100;
        System.out.println("Discount is : "+sp*disc/100);
        System.out.println("After Discount, Price of "+name+" is : "+discountedprice);
    }
}
