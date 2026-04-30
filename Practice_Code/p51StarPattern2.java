// Take input of N from the user and write a program to print the following pattern (N=3) :
// * * * 
// * *   
// *     
// Input Format
// First line contains an integer N.
// Output Format
// Print the required pattern.
// Example 1
// Input
// 3
// Output
// * * * 
// * *   
// *     
// Explanation
// Pattern for N=3.
// Example 2
// Input
// 4
// Output
// * * * *
// * * * 
// * *   
// *     
// Explanation
// Pattern for N=4. 
// Constraints
// 1 <= N <= 15
// Topics
// Loops

import java.util.*;
import java.lang.*;
import java.io.*;

public class p51StarPattern2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				if(j <= n - i + 1){
					System.out.print("* ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
