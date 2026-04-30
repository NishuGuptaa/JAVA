// Using recursion, your task is to print string ACCIOJOB, n times.
// Input Format
// First line contains integer n
// Output Format
// Print the string ACCIOJOB, n times.
// Example 1
// Input
// 3
// Output
// ACCIOJOB
// ACCIOJOB
// ACCIOJOB
// Explanation:
// As the value of n is 3 so, we get 3 times ACCIOJOB.
// Example 2
// Input
// 1
// Output
// ACCIOJOB
// Explanation:
// As the value of n is 1, so we get ACCIOJOB 1 times.
// Constraints
// 1 <= n <= 104
// Topics
// Recursion

import java.io.*;
import java.util.*;

class q1PrintACCIOJOB
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();

        solve(n);

    }

	public static void solve(int n)
    {
        // Your code here
        // tc-->O(n) and sc-->O(n)
        // if(n == 0){
        //     return;
        // }
        // System.out.println("ACCIOJOB");
        // solve(n - 1);
        // return;

        // if(n == 1){
        //     System.out.println("ACCIOJOB");
        //     return;
        // }
        // System.out.println("ACCIOJOB");
        // solve(n - 1);
        // return;

        if(n == 0){
            return;
        }
        solve(n - 1);
        System.out.println("ACCIOJOB");
        return;
    }
}
