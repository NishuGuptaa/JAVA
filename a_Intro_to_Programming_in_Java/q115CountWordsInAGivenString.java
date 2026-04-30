// You are given a string containing some space-separated words. You need to count the number of words in the string.
// NOTE
// You need to complete the given function. The input and printing of output will be handled by the driver code.
// Input Format
// The first line contains the number of test cases.
// For each test case: The first line has the string S.
// Output Format
// For each test case return the number of words.
// Example 1
// Input:
// 1
//   this is  a sample   string  
// Output
// 5
// Explanation
// There are five words which are 'this' , 'is' , 'a' , 'sample' , 'string'.
// Example 2
// Input
// 1
// gear five
// Output
// 2
// Explanation
// The two words that are present here are 'gear', and 'five'.
// Constraints:
// 1 <= T <= 10
// 1 <= |S| <= 10000
// Topics
// Strings - Basics
// Strings
// Companies
// Amazon

import java.io.*;
import java.lang.*;
import java.util.*;

class q115CountWordsInAGivenString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String p = sc.nextLine();
    while (t > 0) {
      String s = sc.nextLine();
      System.out.println(countWords(s));
      t--;
    }
  }

  public static int countWords(String s) {
    // your code here
    int i = 0;
    int count = 0;
    int len = s.length();
    while(i < len){
      while(i < len && s.charAt(i) == ' '){
        i++;
      }
      if(i < len){
        count++;
      }
      while(i < len && s.charAt(i) != ' '){
        i++;
      }
    }
    return count;
  }
}
