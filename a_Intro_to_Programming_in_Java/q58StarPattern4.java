// Take input of N from the user and write a program to print the following pattern (N=4) :
// * * * *  
//   * * *  
//     * * 
//       *
// Input Format
// First line contains an integer N.
// Output Format
// Print the required pattern.
// Example 1
// Input
// 4 
// Output
// * * * *  
//   * * *  
//     * * 
//       *
// Explanation
// Pattern for N=4.
// Example 2
// Input
// 3 
// Output
// * * * 
//   * * 
//     *
// Explanation
// Pattern for N=3. 
// Constraints
// 1 <= N <= 15
// Topics
// Loops

import java.util.*; 

class q58StarPattern4 {

    public static void main(String args[]) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int k = 1; k <= i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i =1; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= n - i + 1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
