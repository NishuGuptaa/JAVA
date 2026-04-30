// Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number n, you have to output the number of integers less than n in the sample space S.
// Input Format
// First line contains an integer n
// Output Format
// Print a single integer denoting number of integers less than n in the sample space S.
// Example 1
// Input
// 9
// Output
// 2
// Constraints
// 1 <= n <= 108
// Expected Time Complexity: O(sqrt(n))
// Expected Space Complexity: O(1)
// Topics
// Arrays
// Math
// Companies
// Codenation

import java.io.*;
import java.util.*;

class Solution {
    public int CountSquares(int n) {
        // Write your code here
        if (n <= 1){
            return 0;
        }  
        return (int)Math.floor(Math.sqrt(n - 1));
    }
}

public class p36CountSquares {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Solution Obj = new Solution();

        System.out.println(Obj.CountSquares(n));
    }
}
