// You are given a number n, you are required to take input of n numbers, find the sum of odd numbers and even numbers separately and print them in the format specified below
// Input Format
// First line contains the integer n
// Second line contains n space separated integers
// Output Format
// Print the String Even xxx Odd yyy, where xxx is the sum of all the even numbers and yyy is the sum of all the odd numbers.
// Example 1
// Input
// 4
// 1 2 3 4
// Output
// Even 6 Odd 4
// Explanation
// Even numbers are {2, 4} so their sum is 6, Odd numbers are {1, 3} and their sum is 4
// Constraints
// 1 <= n <= 104
// 1 <= arr[i] <= 104
// Topics
// Math
// Basics
// Coding
// Companies
// Accenture

import java.util.*;

class Solution {
    static void sumEvenOdd() {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long even = 0;
        long odd = 0;
        for(int i = 1; i <= n; i++){
            int num = sc.nextInt();
            if(num % 2 == 0){
                even += num;
            }
            else{
                odd += num;
            }
        }
        System.out.print("Even " + even + " Odd " + odd);
    }
}

public class p43SumEvenOdd {
    public static void main(String[] args) throws Throwable {
        Solution.sumEvenOdd();
    }
}
