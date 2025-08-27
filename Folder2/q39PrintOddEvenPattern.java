// You are given an integer N.
// You are required to write a program that print the below pattern till N.
// where N is a positive integer provided by the user.
// Pattern : 
// N = 15 : 1 2 5 6 9 10 13 14 
// N = 6  : 1 2 5 6 
// Input Format
// single line consisting of an integer N.
// Output Format
// Print the required pattern.
// Example 1
// Input
// 10
// Output
// 1 2 5 6 9 10 
// Explanation
// Observe the pattern carefully 
// Example 2
// Input
// 15
// Output
// 1 2 5 6 9 10 13 14 
// Explanation
// Observe the pattern carefully
// Constraints
// 1 <= N <= 10000
// Topics
// Math

import java.util.*;

public class q39PrintOddEvenPattern {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            System.out.print(i + " ");
            if(i % 2 == 0){
                i+=3;
            }
            else{
                i++;
            }
        }
    }
}
