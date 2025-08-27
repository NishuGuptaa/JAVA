// Given an integer n, print a pyramid full of stars with height equal to n.
// Input Format
// The first line of input contains the integer n.
// Output Format
// The output should contain a pyramid filled with stars with height equal to n.
// Example 1
// Input
// 3
// Output:
//   * 
//  * *
// * * *
// Example 2
// Input
// 7
// Output
//       * 
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
// * * * * * * *
// Constraints
// 1 <= n <= 200
// Topics
// Loops

import java.util.*;

public class q59StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Write your code here
        for(int i = 1; i <= n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
