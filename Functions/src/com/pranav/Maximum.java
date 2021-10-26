package com.pranav;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three no. : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println("Largest number among three input is : " + max(num1, num2, num3));
    }

    static int max(int a, int b, int c) {
        int maximum;
        if(a>b && b>c)
        {
            maximum = a;
        }
        else
        {
            if(b>a && b>c)
            {
                maximum = b;
            }
            else
            {
             maximum = c;
            }
        }
        return maximum;
    }
}
