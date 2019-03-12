/*
@author: Arun Dhwaj
@date: 12th Mar, 2019
@purpose: Given a string, check if its already palindrome or if not then by removing one only character so that it become palindrome.
Note: If it required more than one character to remove to make the string palindrome, then the input is not valid.
*/

import java.util.*;
import java.io.*;

public class PalindromeIndex
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args) throws IOException
    {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));
    
        int q = scanner.nextInt();
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                    
        for (int qItr = 0; qItr < q; qItr++) 
        {
            String s = scanner.nextLine();
                                            
            int result = palindromeIndex(s);
                                                        
            bufferedWriter.write(String.valueOf(result));
            
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }


    private static int palindromeIndex(String s) 
    {
        //Assuption is the input string is already a palindrome, except one character.
        //If the input string is not a palindrome then the below solution will not work.
        // As the condition is we have to remove the only one character. 

        int len =  s.length();
        int start = 0, end = len-1;      

        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                if((s.charAt(start+1) == s.charAt(end)) && (s.charAt(start+2) == s.charAt(end-1)))
                {
                    return start;
                }
                else if((s.charAt(start) == s.charAt(end-1)) && (s.charAt(start+1) == s.charAt(end-2)))
                {
                    return end;
                }
                else
                {
                    //This is not a valid input, as it required more than one character to be removed in order to make the string palindrome.
                    return -1; 
                }
            }            
            start++;
            end--;
        }   
        return -1;
    }
}
