// Write a java program to print fibonacci numbers till n.
// The Fibonacci sequence is a set of integers (the Fibonacci numbers) that starts with a zero, followed by a one, and then by a series of steadily increasing numbers. The sequence follows the rule that each number is equal to the sum of the preceding two numbers.
// You've to print first n fibonacci numbers.
// Take as input "n", the count of fibonacci numbers to print.
// Print first n fibonacci numbers.
// Input Format
// An integer value n, the count of fibonacci numbers to print.
// Output Format
// Print first n fibonacci numbers
// Example 1
// Input
// 4
// Output
// 0
// 1
// 1
// 2
// Explanation
// The first fibonacci number is 0 and second fibonacci number is 1, so third fibonacci number will be sum of preceding two numbers i.e. 0 + 1 = 1 and fourth fibonacci number will be sum of preceding two numbers i.e. 1 + 1 = 2.
// Example 2
// Input
// 10
// Output
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34
// Explanation
// The first fibonacci number is 0 and second fibonacci number is 1, so third fibonacci number will be sum of preceding two numbers i.e. 0 + 1 = 1 and fourth fibonacci number will be sum of preceding two numbers i.e. 1 + 1 = 2 and fifth fibonacci number will be sum of preceding two numbers i.e. 1 + 2 = 3 and so on.
// Constraints
// 1 < = N < = 40
// Topics
// Loops

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        int n = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(firstNum);
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
public class p83FibonacciSequencePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
