package com.epam.custom;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        customList<Integer> l = new customList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println("Before removing element at index 2");
        l.print();
        l.remove(2);
        System.out.println("After removing element at index 2");
        l.print();
        System.out.println("Size: "+l.size());
    }
}
