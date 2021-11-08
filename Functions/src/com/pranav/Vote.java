package com.pranav;

import java.util.Scanner;

public class Vote
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age of Person : ");
        int n = scan.nextInt();
        Eligible(n);
    }
    static void Eligible(int num)
    {
        if(num>=18){
            System.out.println("he/she is eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }

    }
}
