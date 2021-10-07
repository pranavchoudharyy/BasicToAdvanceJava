package com;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int fNumber = scan.nextInt();
        System.out.println("Enter the second Number ");
        int sNumber = scan.nextInt();
        if (sNumber < fNumber) {
            int temp = sNumber;
            sNumber = fNumber;
            fNumber = temp;
        }
        while (fNumber < sNumber) {
            int rem = sNumber / fNumber;
            sNumber = fNumber;
            fNumber = rem;
        }
        System.out.println();

    }
}
