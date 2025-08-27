// Take input of N from the user and write a program to print the Full Pyramid Number pattern as follows (N=4) :
// Pattern Image
// Input Format
// Input consists of the integer N.
// Output Format
// Print the pattern for value N.
// Example 1
// Input
// 4
// Output
//    1   
//   333  
//  55555 
// 7777777
// Explanation
// Input is 4 means we have 4 lines, and each line has odd numbers which keep on increasing with every row.
// Example 2
// Input
// 3
// Output
//   1   
//  333  
// 55555 
// Explanation
// Input is 3 means we have 3 lines, and each line has odd numbers which keep on increasing with every row.
// Constraints
// 1 <= N <= 100
// Topics
// Loops

import java.util.*;

public class p9OddNumberPyramid {

    public static void main(String[] args) throws Throwable {

        Scanner cs = new Scanner(System.in);
        // System.out.println("Enter the row size:");

        int row_size = cs.nextInt();
        cs.close();
        printPattern(row_size);
    }

    public static void printPattern(int row_size) {
        // your code here
        int num = 1;
        for(int i = 1; i <= row_size; i++){
            for(int j = 1; j <= row_size - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print(num);
            }
            System.out.println();
            num += 2;
        }
        
    }
}
