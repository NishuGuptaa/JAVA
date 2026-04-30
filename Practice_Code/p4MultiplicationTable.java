// Write a program that prompts the user to take a positive input integer. It should then print the multiplication table of that number.
// Input Format
// The first line of input contains an integer 'n' denoting the number of which tables have to be printed.
// Output Format
// Print 10 integers each in a new line denoting the ith term of the multiplication table
// Example 1
// Input
// 3
// Output:
// 3
// 6
// 9
// 12
// 15
// 18
// 21
// 24
// 27
// 30
// Explanation:
// The ith term of tables are 1st is 3, 2nd is 6 and so on.....
// Example 2
// Input
// 10
// Output:
// 10
// 20
// 30
// 40
// 50
// 60
// 70
// 80
// 90
// 100
// Explanation:
// The ith term of tables are 1st is 10, 2nd is 20 and so on.....
// Constraints
// 1 <= N <= 100000
// Topics
// Loops

import java.io.*;
import java.util.*;
class solution
{
    public static void solve(int n)
   {
        //write your code here
        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);
        }
   }
}
public class p4MultiplicationTable {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);        
	    int n=s.nextInt();
        solution.solve(n);
	}
}
