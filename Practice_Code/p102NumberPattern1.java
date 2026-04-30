// You are given an integer N. Your task is to print the following pattern for the given N, where the first row has one 1, the second row has two 1s, and so on.
// Input Format
// The first line of input will contain an integer N that is the total number of rows.
// Output Format
// Output the corresponding pattern
// Example 1
// Input
// 2
// Output
// 1
// 11
// Example 2
// Input
// 4
// Output
// 1
// 11
// 111
// 1111
// Constraints
// 1 <= N <= 10^3
// Topics
// Math

import java.util.*;

public class p102NumberPattern1 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution.printPattern(n);
    }
}

class Solution {
    static void printPattern(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
}
