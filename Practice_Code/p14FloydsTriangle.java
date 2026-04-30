// Take input of N from the user and write a program to print the Floyd's Triangle pattern as follows:
// For n=5,
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10       
// 11 12 13 14 15 
// Input Format
// Input contains the integer N.
// Output Format
// Print the pattern for the value of N.
// Example 1
// Input
// 5
// Output
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10       
// 11 12 13 14 15 
// Example 2
// Input
// 3
// Output
// 1 
// 2 3 
// 4 5 6  
// Constraints
// 1 <= N <= 100
// Topics
// Loops

import java.util.*;

class Accio {
    public void printTriangle(int n) {
        // write code here
        int count = 1;
        for(int i =1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count += 1;
            }
            System.out.println();
        }
    }
}

public class p14FloydsTriangle {
    public static void main(    String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        Obj.printTriangle(n);
    }
}
