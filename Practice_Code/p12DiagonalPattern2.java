// Write a Java program where you are given a number n, you've to create a pattern of * and separated by tab as shown in the output format.
// Input Format
// A number n
// Output Format
//     *
//    *
//   *
//  *
// *
// Example 1
// Input
// 3
// Output
//   *
//  *
// *
// Example 2
// Input
// 7
// Output
//       *
//      *
//     *
//    *
//   *
//  *
// *
// Constraints
// 1 <= 'N' <= 10
// Topics
// Loops

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= 1; j--){
                if(i == j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
public class p12DiagonalPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
