package com;

public class CountingOccurrences
{
    public static void main(String[] args)
    {
        int num = 345635555;
        int count=0;
        while(num!=0)
        {
            int rem = num%10;
            if(rem==5)
            {
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
