package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChangeString changeString = new ChangeString();
        String result = changeString.changer(Type.LOWER, "STRING");
        System.out.println(result);
    }
}
