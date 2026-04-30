// Dr. Doofenshmirtz is planning to capture the Tri State Area. He has an army of robots which can only be stopped using an integer X which is the smallest possible solution to the equation: (X / K) * (X % K) == N  for a given value of K and N. Since platypus Perry is busy fighting crime in the city, he has asked for your help in solving this problem. You are given two integers i.e. K and N and your task is to return the value of X.
// You have to complete minimumX function which consists of integers N and K as input and returns single integer X that denotes the smallest possible solution
// Input Format
// The First line contains two integers N and K are given.
// Output Format
// Return a single integer X that denotes the smallest possible solution to the above equation.
// Example 1
// Input
// 4 6
// Output
// 10
// Explanation
// 10 is the smallest value for which the above equation is satisfied.
// Example 2
// Input
// 8 3
// Output
// 14
// Explanation
// 14 is the smallest value for which the above equation is satisfied.
// Constraints
// 0 < N < 10^5
// 0 < K < 10^4
// Topics
// Conditionals
// Loops
// Basics

import java.util.*;
import java.io.*;

public class p40DoofenshmirtzAndEquation{
 	public static int minimumX(int n, int k){
		//Write your code here
		int x = 1;
		while(true){
			if((x / k) * (x % k) == n){
				return x;
			}
			x++;
		}
	}

	public static void main(String args[]){
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int k=scr.nextInt();
		int ans=minimumX(n,k);
		System.out.println(ans);
	}
}
