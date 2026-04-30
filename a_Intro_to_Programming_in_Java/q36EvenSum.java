// You are given a number N. Print sum of all even numbers from 1 to N.
// Input Format
// There is only an integer N.
// Output Format
// Print the sum as a single integer.
// Example 1
// Input
// 12
// Output
// 42
// Explanation
// The sum of even numbers till 12 is 42. (2+4+6+8+10+12=42)
// Example 2
// Input
// 13
// Output
// 42
// Explanation
// The sum of even numbers till 12 is 42. (2+4+6+8+10+12=42)
// Constraints
// 1 <= |N| <= 10^9
// Topics
// Arrays

import java.util.*;

public class q36EvenSum {
    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n / 2;
        long sumEven = (long) m * (m + 1);
        System.out.print(sumEven);
    }
}
