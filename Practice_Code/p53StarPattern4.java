// Take input of N from the user and write a program to print the following pattern (N=4) :
// * * * *  
//   * * *  
//     * * 
//       *
// Input Format
// First line contains an integer N.
// Output Format
// Print the required pattern.
// Example 1
// Input
// 4 
// Output
// * * * *  
//   * * *  
//     * * 
//       *
// Explanation
// Pattern for N=4.
// Example 2
// Input
// 3 
// Output
// * * * 
//   * * 
//     *
// Explanation
// Pattern for N=3. 
// Constraints
// 1 <= N <= 15
// Topics
// Loops

import java.util.*;
import java.lang.*;
import java.io.*;

public class p53StarPattern4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(j >= i){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
