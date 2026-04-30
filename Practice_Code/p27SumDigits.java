// Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
// Example: sumDigits(126) → 9
// sumDigits(49) → 13
// sumDigits(12) → 3
// Input Format
// First line contains n representing the integer whose sum of digits we have to calculate.
// Output Format
// Return the sum of digits of the input number.
// Example 1
// Input
// 126
// Output
// 9
// Explanation
// Sum of digits 1 + 2 + 6 = 9
// Example 2
// Input
// 2456
// Output
// 17
// Explanation
// Sum of digits 2 + 4 + 5 + 6 = 17
// Constraints
// 1 <= n <= 10^4
// Topics
// Recursion

import java.util.Scanner;

class Solution{
    public static int sumDigits(int n) {
        // Your code here
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
}
public class p27SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(Solution.sumDigits(n));
    }
}
