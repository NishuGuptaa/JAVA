// Given a number N, you need to check whether it is Armstrong number or not.
// A number is called an Armstrong number if the sum of cubes of each digit of the number is equal to the number itself.
// Input Format
// Input contains a single integer N.
// Output Format
// You need to return 1 if the given number N is an Armstrong number, otherwise 0.
// Example 1
// Input
// 1
// Output
// 1
// Explanation
// 1 * 1 * 1 = 1
// Example 2
// Input
// 150
// Output
// 0
// Explanation
// 1 * 1 * 1 + 5 * 5 * 5 + 0 * 0 * 0 = 126, which is not equal to 150.
// Constraints
// 1 <= N <= 10^6
// Topics
// Loops
// Basics
// Companies
// Oracle
// VMware

import java.util.*;

public class p8ArmstrongNumberFinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Solution.isArmstrongOrNot(N);
    }
}

class Solution {
    static void isArmstrongOrNot(int n) {
        // Your code here
        int original = n;
        int arm = 0;
        while(n > 0){
            int rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }
        if(original == arm){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
