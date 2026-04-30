// Write a program to print the pattern based on the number of rows inputted by the user.
// Input Format
// -line contains 'N' 
// Output Format
// - Print the pattern.
// Example 1
// Input
// 4
// Output
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
// Example 2
// Input
// 6
// Output
//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//  *********
//   *******
//    *****
//     ***
//      *
// Topics
// Loops

import java.util.*;

public class p13DiamondPattern {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
