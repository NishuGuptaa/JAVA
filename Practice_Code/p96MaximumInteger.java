// You are given three integers. Your task is to calculate the maximum integer among the given integers.
// Input Format
// The First line contains three integers a, b, and c.
// Output Format
// Print the maximum out of the three integers.
// Example 1
// Input
// 1 2 3
// Output
// 3
// Explanation
// 3 is the maximum out of 1, 2, and 3.
// Example 2
// Input
// 5656 3224 211
// Output
// 5656
// Explanation
// 5656 is the maximum out of 5656, 3224, and 211.
// Constraints
// 1 <= a, b, c <= 10^4
// Topics
// Math

import java.util.*;

class Solution {
    static int maxNumber(int a, int b, int c)
    {
        //Write your code here
        return Math.max(a, Math.max(b, c));
    }
}

public class p96MaximumInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.maxNumber(a,b,c));
    }
}
