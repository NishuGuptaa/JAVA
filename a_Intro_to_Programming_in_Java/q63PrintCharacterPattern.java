// You are given a number N. Print a pattern consisting of N rows, where the first row has 1 A, the second row has 2 Bs, and so on for N letters. Check the examples for a better understanding.
// Input Format
// First line of input contains N, the number of rows for the pattern
// Output Format
// You need to print the pattern.
// Example 1
// Input
// 4
// Output:
// A
// BB
// CCC
// DDDD
// Explanation:
// For number of rows to be 4 we get this output.
// Example 2
// Input
// 5
// Output:
// A
// BB
// CCC
// DDDD
// EEEEE
// Explanation:
// For number of rows to be 5 we get this output.
// Constraints:
// 1 <= N <= 26
// Topics
// Loops

import java.util.*;

public class q63PrintCharacterPattern {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Write your code here
        for(int i = 1; i <= n; i++){
            char ch = (char)('A' + i - 1);
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println();
       }
    }
}
