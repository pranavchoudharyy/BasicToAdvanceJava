package com;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word : ");
        String word = scan.next();
        int length = word.length();
        for(int i=length-1;i>=0;i--)
        {
            System.out.print(word.charAt(i));
        }
    }
}
