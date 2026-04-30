// Write a Java program to get a number from the user and print whether it is positive or negative.
// Positive numbers include the natural, or counting numbers like 1,2,3,4,5, as well as fractions like 3/5 or 232/345, and decimals like 44.3. Even irrational numbers like pi or the square root of two are positive unless you put a negative sign in front of them. Zero is neither negative, nor positive.
// Input Format
// Any integer value.
// Output Format
// Return whether it is positive or negative number
// Example 1
// Input
// 110
// Output
// Number is positive
// Example 2
// Input
// -101
// Output
// Number is negative
// Constraints
// 1 <= ''''''''N'''''''' <= 10^9
// Topics
// Java

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        int n = sc.nextInt();
        if(n < 0){
            System.out.print("Number is negative");
        }
        else if(n > 0){
            System.out.print("Number is positive");
        }
        else{
            System.out.print("Number is zero");
        }
    }
}
public class p76PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
