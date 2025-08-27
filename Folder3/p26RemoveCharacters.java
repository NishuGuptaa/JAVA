// Write a program that takes in a string S and removes all occurrences of the characters ''''a'''', ''''c'''', ''''i'''', and ''''o'''' from it and returns the remaining string in the same order.
// Input Format
// First line contains string.
// Output Format
// a string representing the remaining characters of the input string in the same order
// Example 1
// Input
// You will get placed soon.
// Output
// Yu wll get pled sn.
// Explanation
// Print the required string.
// Example 2
// Input
// Live, love, laugh at AccioJob
// Output
// Lve, lve, lugh t AJb
// Explanation
// Print the required string.
// Constraints
// 1 <= |string| <= 1000
// Topics
// Basics
// Strings

import java.util.*;

class Solution {
    public static String removeChars(String S) {
        // Write your code here
        return S.replaceAll("[acio']", "");
    }
}

public class p26RemoveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Solution obj= new Solution();
        String result = obj.removeChars(S);
        System.out.println(result);
    }
}
