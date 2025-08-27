// You are given an integer N.
// You are required to write a program that prints numbers from N to 1
// where N is a positive integer provided by the user.
// Input Format
// single line consisting of an integer N.
// Output Format
// Print numbers from N to 1.
// Example 1
// Input
// 5
// Output
// 5 4 3 2 1 
// Explanation
// Print numbers from 5 to 1.
// Example 2
// Input
// 8
// Output
// 8 7 6 5 4 3 2 1 
// Explanation
// Print numbers from 8 to 1
// Constraints
// 1 <= n <= 10000
// Topics
// Math

import java.util.Scanner;

public class q31PrintNtoOne {
    public static void main(String[] args) {
         // write your code here
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         for(int i = N; i >= 1; i--){
            System.out.print(i + " ");
         }
    }
}
