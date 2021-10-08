package com;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year to check for leap year : ");
        int leap = scan.nextInt();
            if (leap % 4 == 0 && leap % 100 != 0)
            {
                System.out.println("This is a leap year");
            } else if(leap%400==0){
                System.out.println("This is a leap year");
            }
            else
            {
                System.out.println("Not a leap year");
            }
    }
}
