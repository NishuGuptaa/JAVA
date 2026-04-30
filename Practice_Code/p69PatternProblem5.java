// Write a program to print the pattern based on the number of rows inputted by the user.
// Input Format
// The single line contains 'N'
// Output Format
// Print the pattern.
// Example 1
// Input
// 4
// Output
// * * * * 
// * * *
// * *
// *
// Example 2
// Input
// 6
// Output
// * * * * * * 
// * * * * *
// * * * *
// * * *
// * *
// *
// Constraints
// 1 <= n <= 100
// Topics
// Loops
// Companies
// Adobe

import java.util.Scanner;

public class p69PatternProblem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // write code here
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
