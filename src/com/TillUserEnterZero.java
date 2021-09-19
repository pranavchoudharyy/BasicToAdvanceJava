package com;

import java.util.Scanner;

public class TillUserEnterZero
{
    public static void main(String[] args)
    {
        int sum = 0;
        while(true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Number : ");
            int n = scan.nextInt();
            if(n!=0){
                sum += n;
            }
            else{
                System.out.println("Sum is : "+sum);
                break;
            }
        }


    }
}
