// Given a string str, determine if it is a palindrome, considering only alphabetic characters and ignoring the upper or lower case. Return 0 if it is not a palindrome, else return 1.
// Input Format
// Input consists of one line
// The first line given is a string str.
// Output Format
// Returns 0 if it is not a palindrome, else return 1 if it is a palindrome
// Example 1
// Input
// race a car
// Output
// 0
// Explanation
// Not a palindrome
// Example 2
// Input
// a man, a plan, a canal Panama
// Output
// 1
// Explanation
// It is a palindrome.
// Constraints
// 1 <= str.length <= 10000
// Topics
// Strings - Basics
// Recursion
// 2-Pointers
// Strings
// Companies
// Facebook
// PayTM
// Amazon
// FactSet
// Cisco
// DE Shaw
// Morgan Stanley
// Zoho

import java.io.*;
import java.util.*;
// tc-->O(n) and sc-->O(1)
public class q120PalindromeString {
	static int isPalindrome(String str) {
        //write code here
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        
        while(start < end){
            char strt = str.charAt(start);
            char en = str.charAt(end);

            if(strt < 'a' || strt > 'z'){
                start++;
                continue;
            }

            if(en < 'a' || en > 'z'){
                end--;
                continue;
            }

            if(strt != en){
                return 0;
            }
            else{
                start++;
                end--;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}
