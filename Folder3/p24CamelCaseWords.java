// One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case. You are given a string, s, written in Camel Case. Find All The Words Contained In It.
// Print each word in a newline in the order as they appear in the original string s
// Input Format
// First line contains a string s
// Output Format
// Print each word in a newline
// Example 1
// Input
// IAmAJavaProgrammer
// Output
// I
// Am
// A
// Java
// Programmer
// Constraints
// 1 <= s.size() <= 500
// Topics
// Basics
// Strings

import java.util.*;

public class p24CamelCaseWords {
    public static void CamelCaseWords(String s) {
        //Write your code here
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch) && word.length() > 0){
                System.out.println(word.toString());
                word.setLength(0);
            }
            word.append(ch);
        }
        if (word.length() > 0) {
            System.out.println(word.toString());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        CamelCaseWords(s);
    }
}
