// Given a number n, print the following pattern with n rows.
// 1
// 23
// 345
// 4567
// Complete the given function.
// Input Format
// First line of input contains the integer n.
// Output Format
// Print the pattern.
// Example 1
// Input
// 3
// Output:
// 1
// 23
// 345
// Explanation:
// We print the pattern with 3 rows.
// Example 2
// Input
// 2
// Output:
// 1
// 23
// Explanation:
// This time, we print the pattern with 2 rows.
// Constraints
// 1 <= n <= 100
// Topics
// Loops

import java.io.*;
import java.util.*;

class p80PrintNumberPattern1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Solution s = new Solution();
        s.printPattern(n);
    }
}


class Solution {

    public static void printPattern(int n) {
        for(int i = 1; i <= n; i++){
            int count = i;
            for(int j = 1; j <= i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
