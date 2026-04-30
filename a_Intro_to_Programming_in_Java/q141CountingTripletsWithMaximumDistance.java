// You are given two integers, N and X. You have to find X raised to the power N using recursion. Implement the function using the Exponentiation by Squaring method to solve this problem in O(log N) time complexity.
// Input Format
// The first line contains integer N denoting the number of points
// The second line contains N integers denoting the points
// The third line contains L denoting the maximum distance possible
// Output Format
// Print the count of the total ways of selecting three points
// Example 1
// Input
// 4
// 2 1 3 4
// 3
// Output
// 4
// Explanation
// {1, 2, 3} Here distance between farthest points = 3 – 1 = 2 <= L
// {1, 2, 4} Here distance between farthest points = 4 – 1 = 3 <= L
// {1, 3, 4} Here distance between farthest points = 4 – 1 = 3 <= L
// {2, 3, 4} Here distance between farthest points = 4 – 2 = 2 <= L
// Example 2
// Input
// 4
// 2 1 3 4
// 2
// Output
// 2
// Explanation
// {1, 2, 3} Here distance between farthest points = 3 – 1 = 2 <= L
// {2, 3, 4} Here distance between farthest points = 4 – 2 = 2 <= L
// Constraints
// 1 <= N <= 100
// 0 <= points <= 1000
// 1 <= L <= 500
// Topics
// Arrays
// Array - Basics
// Sorting


public class q141CountingTripletsWithMaximumDistance {
    
}
