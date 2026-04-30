// Write a program to enter numbers till the user wants and in the end the program should print the largest and smallest numbers.
// Input Format
// Enter input of a number from user
// Next ask user if they want to enter another number or not
// If user says yes(y/Y) then enter number again but if the user says no(n/N) then simply stop
// Output Format
// Print the largest number in line 1 and smallest number in line 2 as shown in sample test cases
// Example 1
// Input
// 10
// y
// 5
// Y
// 100
// y
// 256
// n
// Output
// Largest number: 256
// Smallest number: 5
// Example 2
// Input
// 98
// y
// 2341
// Y
// -21
// N
// Output
// Largest number: 2341
// Smallest number: -21
// Constraints
// -10^5 <= Number user inputs will be <= 10^5
// 1<= Total number of user inputs <= 10^5
// Topics
// Loops
// Basics

import java.io.*;
import java.util.*;

public class q48ASLoopsProblem1 {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = num;
        int min = num;
        while(true){
            String str = sc.next();
            while(!str.equalsIgnoreCase("y") && !str.equalsIgnoreCase("n")){
                str = sc.next();
            }
            if(str.equalsIgnoreCase("n")){
                break;
            }
            num = sc.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
