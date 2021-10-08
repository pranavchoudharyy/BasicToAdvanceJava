package com;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int fNumber = scan.nextInt();
        System.out.println("Enter the second Number ");
        int sNumber = scan.nextInt();

        if (sNumber < fNumber)
        {
            int temp = sNumber;
            sNumber = fNumber;
            fNumber = temp;
        }

        while (fNumber != 0 )
        {
            int temp = fNumber;
            fNumber = sNumber%fNumber;
            sNumber = temp;
        }

        System.out.println("HCF is : "+sNumber);
    }
}
