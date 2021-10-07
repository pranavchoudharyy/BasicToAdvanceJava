package com.pranav;

public class Shadowing {
    static int x =50;
    public static void main(String[] args)
    {
        System.out.println(x); // return 50
        int x ; //declaration
        //System.out.println(x); //error
        x = 90; // initialisation
        System.out.println(x); // return 90 (known as Shadowing)
        fun(); // return 50
    }
    static void fun()
    {
        System.out.println(x);
    }
}
