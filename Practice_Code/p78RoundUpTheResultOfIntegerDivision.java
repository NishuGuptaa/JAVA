// Write a Java program to round up the result of integer division.
// Note : Percentage formula = ((Marks 1 + Marks 2 )× 100)/Total Marks.
// Input Format
// Three integer value representing marks 1, marks 2 and total marks
// Output Format
// Return an integer value representing calculated percentage.
// Example 1
// Input
// 5
// 41
// 50
// Output
// 92%
// Explanation
// 5, 41, 50 are three integers representing marks 1, marks 2 and total marks respectively.
// Percentage = (5 + 41 /50) × 100 = 92 
// Example 2
// Input
// 51
// 26
// 80
// Output
// 96%
// Explanation
// 51, 26, 80 are three integers representing marks 1, marks 2 and total marks respectively.
// Percentage = (51 + 26 /80) × 100 = 96
// Constraints
// 1 < = N < = 100000
// Topics
// Java
// Math

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int total = sc.nextInt();
        double percentage = ((marks1 + marks2) * 100) / total;
        int result = (int)Math.ceil(percentage);
        System.out.print(result + "%");
    }
}
public class p78RoundUpTheResultOfIntegerDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
