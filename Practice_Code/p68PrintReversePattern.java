// Given an integer N, print an upside down triangle pattern, where the first row has N stars, the second row has N-1 stars, and so on. Check the sample test cases for a better understanding.
// Input Format
// First line of input contains N, the number of rows for the pattern
// Output Format
// You need to print the pattern.
// Example 1
// Input
// 5
// Output:
// Pattern Image
// Explanation:
// For number of rows to be 5 we get this output.
// Example 2
// Input
// 4
// Output:
// Pattern Image
// Explanation:
// For n=4, this is our generated pattern.
// Constraints
// 1<= N <= 100
// Topics
// Loops

import java.io.*;
import java.util.*;

public class p68PrintReversePattern {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= i - 1; k++){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
