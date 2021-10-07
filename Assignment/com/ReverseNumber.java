package com;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        int n=4567;
        int reverse = 0;
        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            reverse = reverse*10+rem; // logic
        }
        System.out.println(reverse);
    }
}
