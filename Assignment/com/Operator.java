package com;
import java.util.Scanner;

public class Operator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a,b;
        char c; // to input operator
        System.out.println("Input First Number : ");
        a = scan.nextInt();
        System.out.println("Input SecondNumber : ");
        b = scan.nextInt();
        System.out.println("Input the operator to apply : ");
        c = scan.next().charAt(0);
        if(c=='+') // single quote for char
        {
            System.out.println(a + b);
        }
        if(c=='-')
        {
            System.out.println(a-b);
        }
        if(c=='/')
        {
            System.out.println(a/b);
        }
        if(c=='*')
        {
            System.out.println(a*b);
        }
    }
}
