package com;

import java.util.Scanner;

public class LCM
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int fNumber = scan.nextInt();
        System.out.println("Enter the second number ");
        int sNumber = scan.nextInt();
        int lcm = Math.max(fNumber,sNumber);
        while(true)
        {
            if (lcm%fNumber==0 && lcm%sNumber==0){
                System.out.println(lcm);
                break;
            }
            ++lcm;

        }
    }
}
