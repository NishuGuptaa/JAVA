// You are given a number N .
// Print sum of all odd numbers from 1 to N (inclusive).
// Input Format
// single line consisting of an integer N.
// Output Format
// Print the odd Sum.
// Example 1
// Input
// 10
// Output
// 25
// Explanation
// Sum : 1 + 3 + 5 + 7 + 9 = 25 
// Example 2
// Input
// 4
// Output
// 4 
// Explanation
// sum : 1 + 3 = 4
// Constraints
// 1 <= N <= 10^5
// Topics
// Math

import java.util.Scanner;

public class q37OddSum {
    public static void main(String[] args) {
        // write yo code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n + 1) / 2;
        long sumOdd = (long) m * m;
        System.out.print(sumOdd);
    }
}
