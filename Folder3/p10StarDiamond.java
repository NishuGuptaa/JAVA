// Take input of N from the user and write a program to print the solid diamond pattern with stars (N=4) :
//    * 
//   * * 
//  * * * 
// * * * * 
//  * * * 
//   * * 
//    * 
// Input Format
// The first line of input contains the integer N.
// Output Format
// Print the pattern for user entered value of N.
// Example 1
// Input
// 4
// Output
//    * 
//   * * 
//  * * * 
// * * * * 
//  * * * 
//   * * 
//    * 
// Explanation
// Since n = 4, the number of rows = 2n + 1 = 9. First the number of rows keep increasing in each row till row 5 and then they start decreasing.
// Example 2
// Input
// 6
// Output
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
// * * * * * * *
//  * * * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
// Explanation

// Since n = 6, the number of rows = 2n + 1 = 13. First the number of rows keep increasing in each row till row 7 and then they start decreasing.

// Constraints
// 1 <= N <= 400

// Topics
// Loops
// Companies
// Wipro
// TCS
// Deloitte
// Accenture
// Hexaware Technologies
// Meditatek
// Comviva
// Cognizant

import java.util.*;

class Solution {
    public void pattern(int row_size) {
        // your code here
        for(int i = 1; i <= row_size + 1; i++){
            for(int j = row_size + 1 - i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = row_size; i >= 1; i--){
            for(int j = row_size + 1 - i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class p10StarDiamond {

    public static void main(String[] args) throws Throwable {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close();
        Solution solution = new Solution();
        solution.pattern(n);
    }
}
