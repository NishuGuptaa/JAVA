// Consider all lowercase alphabets of the English language. Each alphabet from 'a' to 'z' has a certain weight:
// The weight of 'a' is 1.
// The weight of 'b' is 2.
// The weight of 'c' is 3.
// ...
// The weight of 'z' is 26.
// In other words, the weight of each alphabet is the weight of its previous alphabet plus 1.
// Problem Statement
// You are given a string S consisting of lowercase English characters. Your task is to find the sum of the weights of all characters in this string.
// Example
// For example, consider the string "aba":
// 'a' has a weight of 1,
// 'b' has a weight of 2,
// 'a' again has a weight of 1.
// So, the total sum is 1 + 2 + 1 = 4.
// Input Format
// The first and only line of input contains the string S.
// Output Format
// Print the required sum as an integer on a single line.
// Constraints
// 1 ≤ |S| ≤ 100 (where |S| is the length of the string S)
// Sample Input 1
// aba
// Sample Output 1
// 4
// Topics
// Strings - Basics
// Strings
// Companies
// Capegemini

import java.io.*;

class Result {
    // TODO: Implement this method
    public static int charSum(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sum += (ch - 'a' + 1);
        }
        return sum; // placeholder
    }
}

public class p32CharSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        int result = Result.charSum(s);
        System.out.println(result);
    }
}
