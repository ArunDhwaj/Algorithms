/*
@file: arrayManipulation.java
@author: Arun Dhwaj
@date: 7th Aug, 2018
@purpose: algorithm for manipulation for large data size 
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution 
{
    static int row = 0;

    //Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) 
    {
        //Declaring the variable to store the max element.
        long max = 0, temp = 0;

        //Declaring the a int variable to store the array
        long[] arr = new long[n];

        //As we know in java all the variable is initialize to zero. So, no need for initializing the array elements to zero is required here.

        //Now perform the operations
        //int m = (queries.length)/3;
        //int m = row;

        //System.out.println("m: " + m);

        long[] diffArr = new long[n+1] ;

        for(int i=0; i<row; i++)
        {
            int s = queries[i][0];
            int e = queries[i][1];
            long v = queries[i][2];

            //Operation performed on the array
            diffArr[s] += v;

            if(e+1 <= n)
            {
                diffArr[e+1] -= v;
            }
        }

        for(int j=1; j<n+1; j++)
        {
            temp += diffArr[j]; 

            if( temp > max )
            {
                max = temp;
            }
        }

        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);
        row = m;

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) 
        {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) 
            {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

