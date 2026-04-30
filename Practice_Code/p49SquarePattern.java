// You are given an integer N.
// You are required to write a program that prints a Square pattern of size N × N.
// Pattern for N = 4
// * * * * 
// * * * * 
// * * * * 
// * * * * 
// Input Format
// A single line consisting of an integer N.
// Output Format
// Print the required square pattern.
// Example 1
// Input
// 3
// Output
// * * * 
// * * * 
// * * * 
// Explanation
// Pattern for N = 3
// Example 2
// Input
// 5
// Output
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// Explanation
// Pattern for N = 5
// Constraints
// 1 ≤ N ≤ 100
// Topics
// Loops

import java.util.*;
import java.lang.*;
import java.io.*;

public class p49SquarePattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
