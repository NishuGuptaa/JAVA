// Write a program to take three numbers a, b & c from the user and print the greatest number.
// Input Format
// First line contain 1st number Second line contains 2nd number Third line contains 3rd number
// Output Format
// Print the largest number.
// Example 1
// Input
// 12
// 3
// 4
// Output
// 12
// Example 2
// Input
// 34
// 4
// 5
// Output
// 34
// Constraints
// 1 <= a, b, c <= 100
// Topics
// Conditionals
// Basics

import java.util.Scanner;

public class q25LargestNumber {
    public static void main(String[] args) {
        //write code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.println(a);
        }
        else if(b > a && b > c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
