package com.company;

public class Main {

    public static void main(String[] args)
    {
        //Singleton implementation
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
    }
}
