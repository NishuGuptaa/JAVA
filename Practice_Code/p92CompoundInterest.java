// Write a java program to calculate Compound Interest, Compound interest is the addition of interest to the principal sum of a loan or deposit, or in other words, interest on principal plus interest.
// Formula to calculate compound interest annually is given by:
// Compound Interest = P(1 + R/100)^T Where, P is principal amount R is the rate and T is the time span
// Input Format
// First line contains a single integer denoting the value of P. Second line contains a single integer denoting the value of T. The third line contains a single integer denoting the value of R.
// Output Format
// Return Compound Interest
// Example 1
// Input
// 400
// 55
// 9
// Output
// Compound interest = 45763.30464624552
// Example 2
// Input
// 800
// 6.8
// 7.55
// Output
// Compound interest = 1312.3232015379879  
// Constraints
// 1 < = N < = 10^9
// Topics
// Math
// Java

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        double P = sc.nextDouble();
        double T = sc.nextDouble();
        double R = sc.nextDouble();
        System.out.print("Compound interest = " + P * Math.pow((1 + R / 100), T));
    }
}
public class p92CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
