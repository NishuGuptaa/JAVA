// Given two integers a and b. Your task is to print Yes if one of these is 10 or their sum is 10, else print No.
// Input Format
// The First line contains two integers a and b.
// Output Format
// Print Yes if the given condition satisfies else print No.
// Example 1
// Input
// 5 5
// Output
// Yes
// Explanation
// Here, a and b sum is 10 , satisfying one of the condition.
// Example 2
// Input
// 6 3
// Output
// No
// Explanation
// Here , none of the condition is satisfying
// Constraints
// -10^4 <= a, b <= 10^4
// Topics
// Conditionals
// Basics

import java.util.*;

class Solution{
	static void solve(int a, int b){
		//Write your code here and print output in this function
		if(a + b == 10){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}
}
public class p39ConditionalProblem7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Solution.solve(a,b);
	}
}
