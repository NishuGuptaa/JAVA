// A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.
// Input Format
// The first line inputs a string, S.
// Output Format
// In a new line, print "pangram" if string contains every letter of the alphabet else "not pangram".
// Example 1
// Input
// We promptly judged antique ivory buckles for the next prize
// Output
// pangram
// Explanation All of the letters of the alphabet are present in the string.
// Example 2
// Input
// We promptly judged antique ivory buckles for the prize
// Output
// not pangram
// Explanation
// The string lacks an x.
// Constraints:
// 0 < length of s <= 1000\
// Each character of s, s[i]∈{a-z,A-Z,space}
// Topics
// Strings - Basics
// Arrays
// Array - Basics
// Hashing
// Strings
// Companies
// Snapdeal

import java.util.*;
import java.io.*;

public class q117Pangrams {
     public  static void isPangram(String s) {
          // Your code here
          String str = s.toLowerCase();
          boolean[] arr = new boolean[26];
          for(int i = 0; i < str.length(); i++){
               char ch = str.charAt(i);
               if(ch >= 'a' && ch <='z'){
                    int j = ch - 'a';
                    arr[j] = true;
               }
          }
          for(int i = 0; i < arr.length; i++){
               if(arr[i] == false){
                    System.out.print("not pangram");
                    return;
               }
          }
          System.out.print("pangram");
    }
    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        
    }
}
