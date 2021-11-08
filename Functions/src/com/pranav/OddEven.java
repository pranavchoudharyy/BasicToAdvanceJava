package com.pranav;

import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        OddOrEven(num);

    }
    static void OddOrEven(int n)
    {
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
