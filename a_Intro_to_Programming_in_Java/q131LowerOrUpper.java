// Given a character ch, check if it is an Uppercase letter or Lowercase letter. Return U if ch is an Uppercase letter and L if ch is Lowercase letter.
// Input Format
// First line contains a character ch
// Output Format
// Return the character L or U according to the question.
// Example 1
// Input
// k
// Output
// L
// Example 2
// Input
// K
// Output
// U
// Constraints
// ch is a lowercase letter or uppercase letter only.
// Topics
// Conditionals
// Basics

import java.util.*;

public class q131LowerOrUpper {
    public static char LowerUpper(char ch) {
        //Write your code here
        if(ch >= 'a' && ch <= 'z'){
            return 'L';
        }
        else{
            return 'U';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println(LowerUpper(ch));
    }
}
