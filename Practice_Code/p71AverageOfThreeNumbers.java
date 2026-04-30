// Write a Java program to compute the average of three numbers.
// In ordinary language, an average is a single number taken as representative of a list of numbers, usually the sum of the numbers divided by how many numbers are in the list (the arithmetic mean). For example, the average of the numbers 2, 3, 4, 7, and 9 (summing to 25) is 5. Depending on the context, an average might be another statistic such as the median, or mode.
// Note : use double data type
// Input Format
// Any three integer value.
// Output Format
// Return average
// Example 1
// Input
// 10
// 20
// 30
// Output
// 20
// Example 2
// Input
// 26
// 22
// 24
// Output
// 24
// Constraints
// 1 <= ''''''''N'''''''' <= 10^9
// Topics
// Java
// Math

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = (double)(a + b + c) / 3;
        System.out.print(avg);
    }
}
public class p71AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
