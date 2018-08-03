/**
@file: ReadingUserInputByConsole.java
@author: Arun Dhwaj
@date: 3rd Aug, 2018
@Purpose: Reading input from user using Console
**/

public class ReadingUserInputByConsole
{
    public static void main( String[] args)
    {
        System.out.println("Please enter your name: ");
        String name = System.console().readLine();

        System.out.println( name );
    }
}

