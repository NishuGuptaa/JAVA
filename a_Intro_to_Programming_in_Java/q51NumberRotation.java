// Given two numbers n and k, you need to rotate n, k times to the right. If k is negative, rotate n, k times to the left.
// Note:
// Rotating right means removing rightmost digit from n and adding it to the start.
// Rotating left means removing leftmost digit from n and adding it to the end.
// Assume that the number of rotations will not result in leading 0's, i.e. n=1203, k =2 such that 0312 is the answer, such test cases will not be given.
// k can be bigger than n.
// Input Format
// First line which has two integer n and k.
// Output Format
// Print the rotated number in a single line.
// Example 1
// Input
// 1256 1
// Output
// 6125
// Explanation
// since k=1, right rotating the number one time leads to 6125.
// Example 2
// Input
// 1256 -1
// Output
// 2561
// Explanation
// since k=1, left rotating the number one time leads to 2561.
// Constraints
// 1 <= n,k <= 10^9
// Topics
// Math

import java.util.*;

public class q51NumberRotation {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = n;

        // Count number of digits in n
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Normalize k
        k = k % digits;
        if (k < 0) {
            k = k + digits; // Convert left rotation to equivalent right
        }

        // If no rotation needed
        if (k == 0) {
            System.out.println(n);
            return;
        }

        // Split the number
        int pow = (int)Math.pow(10, k);
        int right = n % pow;
        int left = n / pow;

        // Combine right + left in rotated position
        int rotated = right * (int)Math.pow(10, digits - k) + left;

        System.out.println(rotated);

        sc.close();
    }
}
