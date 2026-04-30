// Take an input of N from the user and write a program to print an upside down triangle pattern, where the first row has N stars, the next row has N-1, and the Nth row has 1 star (Check the samples for a better understanding).
// Your task is to complete the function generatePattern which receives n as its parameter and prints the mentioned pattern.
// Input Format
// First line of input contains N, the number of rows for the pattern
// Output Format
// You need to print the pattern.
// Example 1
// Input
// 5
// Output:
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
// Explanation:
// If n = 5, this is our generated pattern.
// Example 2
// Input
// 4
// Output:
// * * * * 
//  * * * 
//   * * 
//    * 
// Explanation:
// For n=4, this is our generated pattern.
// Constraints
// 1 <= N <= 100
// Topics
// Loops

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public static void generatePattern(int N) {
        // write code here
        for(int i = N; i >= 1; i--){
            for(int j = 1; j <= N - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class p21InvertedTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Solution obj=new Solution();
        obj.generatePattern(N);
    }
}
