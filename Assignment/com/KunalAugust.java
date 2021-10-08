package com;

public class KunalAugust
{
    public static void main(String[] args) {
        int numberOfDays = 31;
        int count = 0;
        for(int i=1;i<=numberOfDays;i++){
            if(i%2==0) {
                count++;
            }
        }
        System.out.println("no. of days kunal can go out in august is : "+count);
    }
}
