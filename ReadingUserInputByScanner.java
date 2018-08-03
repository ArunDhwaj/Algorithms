/**
@file: ReadingUserInputByScanner.java
@author: Arun Dhwaj
@date: 3rd Aug, 2018
@Purpose: Reading input from user using Scanner class
**/

import java.util.Scanner;

public class ReadingUserInputByScanner
{
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println( name );

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println( age );

    }
}

