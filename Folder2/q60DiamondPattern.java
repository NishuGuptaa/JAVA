// Given an integer N, print a diamond full of stars * with height equal to N.
// Note It is given that N is odd.
// Input Format
// The first line contains the number of test cases.
// For each test case: The first line contains an integer N denoting the height of the pyramid.
// Output Format
// For each test case print the required pattern.
// Example 1
// Input
// 1
// 5
// Output
// Explanation
// The required diamond of height 5 has been returned.
// Example 2
// Input
// 1
// 3
// Output
// Explanation
// The required diamond of height 3 has been returned.
// Constraints
// 1 <= T <= 10
// 1 <= N <= 100
// N is odd.
// Topics
// Loops

import java.util.*;
class q60DiamondPattern{
        public static void main(String[] args){
                //Write your code here 
                //Take required input and print the output
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();  // Number of test cases

                while (t-- > 0) {
                        int n = sc.nextInt();
                        int mid = (n + 1) / 2;
                        for(int i = 1; i <= mid; i++){
                                for(int j = 1; j <= mid - i; j++){
                                        System.out.print("  ");
                                }
                                for(int k = 1; k <= 2 * i - 1; k++){
                                        System.out.print("* ");
                                }
                                System.out.println();
                        }
                        for(int i = mid - 1; i >= 1; i--){
                                for(int j = 1; j <= mid - i; j++){
                                        System.out.print("  ");
                                }
                                for(int k = 1; k <= 2 * i - 1; k++){
                                        System.out.print("* ");
                                }
                                System.out.println();
                        }
	        }
        }
}