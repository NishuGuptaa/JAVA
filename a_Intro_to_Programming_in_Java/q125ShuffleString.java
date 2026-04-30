// Given a string s and an integer array indices of the same length.
// The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
// Print the shuffled string.
// Input Format
// Input consists of two lines.
// First line contains an integer n.
// Second line contains the string.
// Last line contains the indices separated by space.
// Output Format
// Print the shuffled string.
// Example 1
// Input
// 8
// acciojob
// 4 5 6 7 0 2 1 3
// Output
// oojbacci
// Explanation
// As the problem states "acciojob" becomes "oojbacci" after shuffling.
// Example 2
// Input
// 3
// abc
// 0 1 2
// Output
// abc
// Explanation
// No shuffling is done here.
// Constraints
// 1 <= n <= 500
// Topics
// Strings - Basics
// Arrays
// Array - Basics
// Strings

import java.util.*;

public class q125ShuffleString {
    
    static void shuffleString(int[] indices, String s) {
        // Write your code here and print output in this function
        char[] str = new char[s.length()];
        for(int i = 0; i < s.length(); i ++){
            str[indices[i]] = s.charAt(i);
        }
        System.out.print(new String(str));
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        shuffleString(arr, str);
        sc.close();
    }
}
