// You are given an input n. You need to print the pattern as shown in the example.
// Input Format
// The first line contains an integer n.
// Output Format
// Print the required pattern.
// Example 1
// Input
// 5
// Output
// *   *
//  * * 
//   *  
//  * * 
// *   *
// Explanation
// The required pattern is printed.
// Example 2
// Input
// 6
// Output
// *    *
//  *  * 
//   **  
//   **  
//  *  * 
// *    *
// Explanation
// The required pattern is printed.
// Constraints
// 1 ≤ N ≤ 1000
// Topics
// Loops

import java.util.*;

public class p15PatternPrinting {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for(int i = 1; i <= n; i++){
      for(int j = n; j >= 1; j--){
        if(i == j || j == n - i + 1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    // for(int i = n; i >= 1; i--){
    //   for(int j = n; j >= 1; j--){
    //     if(i == j){
    //       System.out.print("*");
    //     }
    //     else{
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }
	
	//Write code here
  }
}
