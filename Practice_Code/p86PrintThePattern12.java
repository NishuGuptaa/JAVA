// Take input of N from the user and write a program to print the following pattern
// *	
	// *	
		// *	
			// *	
				// *				
// Complete the given function.
// Input Format
// Enter input of an integer N
// Output Format
// Print the pattern for user entered value of N
// Example 1
// Input
// 5
// Output
// *	
	// *	
		// *	
			// *	
				// *	
// Example 2
// Input
// 7
// Output
// *	
	// *	
		// *	
			// *	
				// *	
					// *	
						// *	
// Constraints
// 1 <= n <= 100
// Topics
// Loops
// Basics

import java.util.*;

public class p86PrintThePattern12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // Write your code here
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print("\t");
            }
            System.out.println("*\t");
        }
    }
}
