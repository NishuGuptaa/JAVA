// You are given two numbers m and n, you are required to print all the Armstrong Numbers between m and n (both inclusive).
// Armstrong Numbers are numbers those have the sum of their own digits raised to the power number of digits equals the number itself. Eg. 153 = 13 + 53 + 33, so 153 is an Armstrong number.
// Input Format
// First line contains two integers m and n
// Output Format
// Print all the Armstrong numbers between m and n in a single line with space   in between.
// Example 1
// Input
// 0 160
// Output
// 0 1 2 3 4 5 6 7 8 9 153
// Constraints
// 0 <= m <= n <= 105
// Topics
// Loops
// Math

import java.util.*;

public class q64ArmstrongNumbersinRange {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i <= n; i++){
            int num = i;
            int digit = String.valueOf(num).length();
            int sum = 0;
            int temp = num;
            while(temp > 0){
                int rem = temp % 10;
                sum += Math.pow(rem, digit);
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        
    }
}
