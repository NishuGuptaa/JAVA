// Write a Java program and check if the entered character is a vowel or a consonant
// Input Format
// The line contains a character.
// Output Format
// Print 1 if it is a vowel and -1 if it is not.
// Example 1
// Input
// a
// Output
// 1
// Example 2
// Input
// b
// Output
// -1
// Constraints
// Each test case only contains one character
// Topics
// Conditionals
// Strings
// Java

import java.util.*;

public class p81VowelCheck {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
            System.out.print(1);
        }
        else{
            System.out.print(-1);
        }
    }
}
