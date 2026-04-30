// Write a Java program to multiply two numbers.
// Input Format
// first line contains 1st number
// second line contains 2nd nuumber
// Output Format
// Print the result
// Example 1
// Input
// 20
// 5
// Output
// 100 
// Example 2
// Input
// 4
// 3
// Output
// 12
// Constraints
// 1 <= a,b <= 104
// Topics
// Math
// Java

import java.util.*;
class p82Multiplication
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        // your code here
        System.out.print(n * m);
    }
}
