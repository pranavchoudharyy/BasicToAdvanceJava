package com.pranav;

import java.util.Scanner;

public class Minimum
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three no. : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println("Smallest number among three input is : " + min(num1, num2,num3));
    }
    static int min(int a , int b , int c)
    {
        int minimum;
        if(a<b && a<c){
            minimum =a;
        }
        else{
            if(b<a && b<c){
                minimum=b;
            }
            else{
                minimum =c;
            }
        }
        return minimum;
    }
}
