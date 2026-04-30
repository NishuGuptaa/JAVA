// Given the number n, print its digits starting from most significant digit to least significant digit.
// Input Format
// Input consists of single line which has the integer n.
// Output Format
// print the digits of number one line at a time.
// Example 1
// Input
// 1256
// Output
// 1
// 2
// 5
// 6
// Explanation
// Here, the digits are, 1,2,5,6.
// Example 2
// Input
// 12345
// Output
// 1
// 2
// 3
// 4
// 5
// Explanation
// Here the digits are 1,2,3,4,5.
// Constraints
// 1 <= n <= 10^9
// Topics
// Basics
// Math

import java.util.*;

public class q43PrintDigits {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int revDigit = 0;
        while(n != 0){
            int lastDigit = n % 10;
            revDigit *= 10;
            revDigit += lastDigit;
            n = n / 10;
            i++;
        }
        while(i > 0){
            int lastDigit = revDigit % 10;
            revDigit /= 10;
            i--;
            System.out.println(lastDigit);
        }
    }
}
