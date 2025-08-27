// Given a string S, append the string " will get placed soon." to it and print the resulting string.
// Input Format
// First line contains string.
// Output Format
// Print string with " will get placed soon"
// Example 1
// Input
// You
// Output
// You will get placed soon.
// Explanation
// Print the required string.
// Example 2
// Input
// Your order
// Output
// Your order will get placed soon.
// Explanation
// Print the required string.
// Constraints
// 1 <= |string| <= 1000
// Topics
// Basics
// Strings
// Companies
// Samsung
// PayTM

import java.util.*;

class Solution {
    public static void placedSoon(String str){
        //Write your code here
        System.out.println(str + " will get placed soon.");
    }
}

public class p20WillGetPlacedSoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        Solution Obj= new Solution();
        Obj.placedSoon(str);
    }
}
