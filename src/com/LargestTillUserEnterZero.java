package com;

import java.util.Scanner;

public class LargestTillUserEnterZero
{
    public static void main(String[] args) {
        int max =0;
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Input number : ");
            int n = scan.nextInt();

            if(n!=0){
                max = Math.max(max,n);
            }
            else{
                System.out.println(max);
                break;
            }
        }
    }
}
