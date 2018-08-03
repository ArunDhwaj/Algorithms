/**
@file: ReadingUserInputByReader.java
@author: Arun Dhwaj
@date: 3rd Aug, 2018
@Purpose: Reading input from user using BufferedReader class
**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingUserInputByReader
{
    public static void main( String[] args) throws IOException
    {
        System.out.println("Please enter your name: ");
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        //Reading data using readline
        
        String name = br.readLine();
        
        System.out.println( name );
    }
}

