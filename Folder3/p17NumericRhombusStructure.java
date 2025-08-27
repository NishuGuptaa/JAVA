// Write a Java program to display the number rhombus structure
// Input Format
// An integer number
// Output Format
// Return an rhombus structure corresponding to the input integer.
// Example 1
// Input
// 5
// Output
//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1
// Example 2
// Input
// 7
// Output
//       1                                                  
//      212                                                 
//     32123                                                
//    4321234                                               
//   543212345                                              
//  65432123456                                             
// 7654321234567                                            
//  65432123456                                             
//   543212345                                              
//    4321234                                               
//     32123                                                
//      212                                                 
//       1   
// Constraints
// 1 < = N < = 100
// Topics
// Loops

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
			for(int k = 1; k <= n - i; k++){
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--){
				System.out.print(j);
			}
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
			System.out.println();
		}
        for(int i = n - 1; i >= 1; i--){
			for(int k = 1; k <= n - i; k++){
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--){
				System.out.print(j);
			}
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
			System.out.println();
		}
    }
}
public class p17NumericRhombusStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
