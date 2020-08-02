package com.company;

public class Singleton
{
    private static Singleton single_instance=null;
    public String s;
    private Singleton()
    {
        s="Inside Singleton class";
    }

    //Thread safe implementation of Singleton Class
    synchronized public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}
