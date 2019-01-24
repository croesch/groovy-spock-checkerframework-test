package com.mycompany.app;

import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( helloWorld() );
    }

    @NonNullDecl
    public static String helloWorld() {
      return null;
    }
}
