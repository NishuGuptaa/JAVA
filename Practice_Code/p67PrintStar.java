// Print the * in 180 degrees rotated triangle format of size N.
// A 180 degree rotated triangle of size 5 looks like this-
//     *       
//    **    
//   ***
//  ****
// *****
// Input Format
// First line of input contains an integer N
// Output Format
// Print the * in required format.
// Example 1
// Input
// 3
// Output
//   *       
//  **    
// ***
// Example 2
// Input
// 5
// Output
//     *       
//    **    
//   ***
//  ****
// *****
// Constraints
// 1<=N<=100
// Topics
// Loops

import java.util.*;

class Accio{
    static void PrintStar(int N){
        //write code and print here
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class p67PrintStar {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Accio obj = new Accio();
        obj.PrintStar(N);
    }
}
