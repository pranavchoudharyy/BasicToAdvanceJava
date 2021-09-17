package com;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int ans = 0;

        while(true)
        {   //take operator
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the operator");
            char op = scan.next().trim().charAt(0);


            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%')
            {
                //take two input
                System.out.println("enter two numbers : ");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                if(op=='+')
                {
                    ans = num1+num2;
                }
                if(op=='-')
                {
                    ans = num1-num2;
                }
                if(op=='*')
                {
                    ans = num1*num2;
                }
                if(op=='/')
                {
                    if(num2!=0)
                    {
                        ans = num1/num2;
                    }
                    else
                    {
                        ans=0;
                        System.out.println("can't be 0");
                    }

                }
                if(op=='%')
                {
                    ans = num1%num2;
                }

            }
            else if(op=='x' || op=='X')
            {
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }
            System.out.println("Result is : "+ans);
        }

    }
}
