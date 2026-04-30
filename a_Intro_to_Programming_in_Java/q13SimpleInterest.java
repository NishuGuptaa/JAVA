// Write a java program to calculate Simple Interest, Simple interest is a quick method of calculating the interest charge on a loan. Simple interest is determined by multiplying the daily interest rate by the principal by the number of days that elapse between payments.
// Simple interest formula is given by:
// Simple Interest = (P x T x R)/100
// Where, P is the principal amount T is the time and R is the rate
// Input Format
// Three integer number
// Output Format
// Return Simple Interest
// Example 1
// Input
// 500
// 50
// 2.6
// Output
// Simple interest = 650.0
// Example 2
// Input
// 700
// 5
// 6
// Output
// Simple interest = 210.0  
// Constraints
// 1 < = N < = 10^9
// Topics
// Math

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        // Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double T = sc.nextDouble();
        double R = sc.nextDouble();
        System.out.println("Simple interest = " + ((P * T * R) / 100));

    }
}
public class q13SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
