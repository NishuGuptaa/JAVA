// Print the given pattern (N=5):
//     1
//    222
//   33333
//  4444444
// 555555555
// Input Format
// Input consists of integer N.
// Output Format
// Print the pattern for value N.
// Example 1
// Input
// 5
// Output
//     1
//    222
//   33333
//  4444444
// 555555555
// Explanation
// The pattern is of pyramid with first line consisting of one 1, it goes on the same till it reaches till 2*N-1 number of Ns.
// Example 2
// Input
// 3
// Output
//   1
//  222
// 33333
// Explanation
// Same explanation as above.
// Constraints
// 1 <= N <= 100
// Topics
// Loops
// Companies
// Catchpoint

import java.io.*;
import java.util.*;

public class p16PrintPattern {
	public static void main(String args[]) {
		// your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int k = 1; k <= n - i; k++){
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
