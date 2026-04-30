// Write a program to input a number and check if the last digit is even or not.
// Input format
// The first line contains a number n.
// Output format
// Print 1 if the last digit is even and 0 if the last digit is odd.
// Example 1
// Input format
// 2009
// Output format
// 0
// Example 2
// Input format
// 1012
// Output format
// 1
// Constraint
// 1 <= n <= 10000
// Topics
// Math

import java.util.*;
class p98LastDigitEven
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        // Your code here
        int digit = a % 10;
        if(digit % 2 == 0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
}
