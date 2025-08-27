// Given an integer n, print all prime numbers between 1 and n (both inclusive).
// Example:
// If n = 8, your program should output all prime numbers between 1 and 8. Thus, it should output:
// 2
// 3
// 5
// 7
// Input Format
// The first line of the input contains one integer n.
// Output Format
// Your code should output all integers between 1 and n that are prime (both inclusive).
// Example 1
// Input:
// 8
// Output:
// 2
// 3
// 5
// 7
// Example 2
// Input:
// 13
// Output:
// 2
// 3
// 5
// 7
// 11
// 13
// Constraints
// 1 <= n <= 10^5
// Topics
// Loops
// Math
// Companies
// MAQ Software
// VMware
// SAP

import java.util.*;

public class q65OptimusPrime {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here
        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
