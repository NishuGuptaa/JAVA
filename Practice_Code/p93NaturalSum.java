// Write a program to calculate the sum of first N natural numbers.
// Note: Natural numbers are the numbers that start from 1 and end at infinity.
// Input Format
// First line contains an integer N
// You need to complete printSum function which contains N natural number and return sum of final summation upto N.
// Output Format
// Print the sum in first line
// Example 1
// Input
// 10
// Output
// 55
// Explanation
// Here, sum is 55 i.e. 1+2+3+4+....+9+10 = 55.
// Example 2
// Input
// 20
// Output
// 210
// Explanation
// Here, sum is 210 i.e. 1+2+3+4+....+19+20 = 210.
// Constraints
// 1 <= N <= 10^3
// Topics
// Math

import java.util.*;

public class p93NaturalSum {
	static int printSum(int N){
        //Write your code here
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    
        System.out.println(printSum(N));
    }
}
