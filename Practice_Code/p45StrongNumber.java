// Given a number n, check whether the given number is a Strong Number or not.
// Note: Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.
// Input Format
// First line of input contains a single number n.
// Output Format
// Print 1 if the given number is a strong number, else print 0.
// Example 1
// Input
// 145
// Output
// 1
// Explanation
// 1! + 4! + 5! = 145.
// Example 2
// Input
// 11
// Output
// 0
// Explanation
// 1!+1!=2, which is not equal to 11.
// Constraints
// 1 <= n <= 1000
// Topics
// Number System: Number Problems
// Math

import java.io.*;
import java.util.*;

class Accio {
    public static int strongNumber(int n)
    {
       //Write code here and print output
       int temp = n;
       int sum = 0;
       while(n > 0){
        int digit = n % 10;
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        sum += fact;
        n /= 10;
       }
       if(temp == sum){
        return 1;
       }
       else{
        return 0;
       }
    }
}
public class p45StrongNumber {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();       
        Accio A= new Accio();        
        int ans=A.strongNumber(n);
        System.out.println(ans);
    }
}
