package com.company;
import java.io.File;

public class Main {

    static void print(File a[],int level)
    {
        for (File f : a)
        {
            for (int i = 0; i < level; i++)
                System.out.print("\t");
            if(f.isDirectory())
            {
                System.out.println("[" + f.getName() + "]");
                print(f.listFiles(), level + 1);
            }
        }
    }

    public static void main(String[] args)
    {
	    String ph="/home/vishal/Angular";
	    File dir=new File(ph);

	    if(dir.exists() && dir.isDirectory())
        {
            File a[] = dir.listFiles();
            System.out.println("Files from main directory :");
            print(a,0);
        }
    }
}
