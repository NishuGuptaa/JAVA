// Write a program to print out all Armstrong numbers between 1 and N.
// A number is called an Armstrong number if the sum of cubes of each digit of the number is equal to the number itself.
// For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
// Input Format
// The input contains a single integer representing N.
// Output Format
// Print all the Armstrong numbers from 1 to N in separate lines.
// Example 1
// Input
// 200
// Output
// 1
// 153
// Explanation
// 1 and 153 are only Armstrong numbers between 1 to 200.
// Example 2
// Input
// 1000
// Output
// 1
// 153
// 370
// 371
// 407
// Explanation
// 1, 153, 370, 371, 407 are only Armstrong numbers between 1 to 1000.
// Constraints
// 1 <= N <= 10^6
// Topics
// Loops
// Basics
// Math
// Companies
// Oracle
// VMware

import java.util.*;

class p34ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		//write code here
        for(int i = 1; i <= N; i++){
            int original = i;
            int sum = 0;
            int temp = original;
            while(temp > 0){
                int rem = temp % 10;
                sum += (rem * rem * rem);
                temp /= 10;
            }
            if(sum == original){
                System.out.println(original);
            }
        }
    }
}
