// In this task, you have to print n stars * vertically and n horizontally. You are given functions to complete. Donot worry about the input and ouput of functions just print n vertical stars in vertical and n horizontal stars in horizontal.
// Note
// Your task is to complete the functions verticalN() and horizontalN() given to print the stars.
// Input Format
// The first line of input contains n.
// Output Format
// print the stars in horizontal and vertical direction.
// Example 1
// Input
// 3
// Output
// * * * 
// *
// *
// *
// Exaplantion
// We print the 3 stars in horizontal and 3 stars vertical direction.
// Example 2
// Input
// 5
// Output
// * * * * * *
// *
// *
// *
// *
// Exaplantion
// We print the 5 stars in horizontal and 5 stars vertical direction.
// Constraints
// 1<= n <= 100
// Topics
// Basics

import java.io.*;
import java.util.*;

class p18NStarsFunctions
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        Solution obj=new Solution();
        obj.horizontalN(n);
        obj.verticalN(n);
        
    }
}

class Solution{
    
    static void horizontalN(int n)
    {
          // Your code here
          for(int i = 1; i<= n; i++){
            System.out.print("* ");
          }
          System.out.println();
        
    }

    static void verticalN(int n)
    {
        // your code here
        for(int i = 1; i <= n; i++){
            System.out.println("*");
        }
        
    }
}
