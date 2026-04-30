// Take input of N from the user and write a program to print the following pattern
// 1								1	
// 1	2						2	1	
// 1	2	3				3	2	1	
// 1	2	3	4		4	3	2	1	
// 1	2	3	4	5	4	3	2	1	
// Complete the given function.
// Input Format
// Enter input of an integer N
// Output Format
// Print the pattern for user entered value of N
// Example 1
// Input
// 4
// Output
// 1						1	
// 1	2				2	1	
// 1	2	3		3	2	1	
// 1	2	3	4	3	2	1
// Example 2
// Input
// 5
// Output
// 1								1	
// 1	2						2	1	
// 1	2	3				3	2	1	
// 1	2	3	4		4	3	2	1	
// 1	2	3	4	5	4	3	2	1	
// Constraints
// 1 <= N <= 10
// Topics
// Basics

import java.util.*;

public class p89PrintThePattern2{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // Write your code here
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j + "\t");
        }
        for(int s = 1; s <= 2 * (n - i) - 1; s++){
            System.out.print("\t");
        }
        int start = i;
        if(i == n){
            start = i - 1;
        }
        for (int k = start; k >= 1; k--) {
            System.out.print(k + "\t");
        }
        System.out.println();
    }
 }
}
