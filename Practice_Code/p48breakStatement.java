// Write a Java program that continuously takes integer input from the user.
// The program should count how many numbers are entered until an odd number is encountered.
// The counting should include the odd number.
// Use a break statement to terminate the loop when the odd number is found.
// Finally, print the total count of numbers entered.
// Input
// 6
// 2
// 8
// 3
// Output
// 4

import java.util.*;
import java.lang.*;
import java.io.*;

public class p48breakStatement
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = 0;
		while(n % 2 == 0){
			n = sc.nextInt();
			sum++;
			if(n % 2 != 0){
				break;
			}
		}
		System.out.println(sum);
	}
}