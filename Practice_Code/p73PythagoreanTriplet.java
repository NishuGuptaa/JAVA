// Write a Java program to check if a given set of numbers is a valid pythagorean triplet.
// Pythagorean triples are a^2+b^2 = c^2 where a, b and c are the three positive integers. These triples are represented as (a,b,c). Here, a is the perpendicular, b is the base and c is the hypotenuse of the right-angled triangle.
// Input Format
// Take any input three numbers a, b and c.
// Output Format
// Print true if they can form a pythagorean triplet and false otherwise.
// Example 1
// Input
// 3
// 4
// 5
// Output
// true
// Example 2
// Input
// 4
// 7
// 12
// Output
// false
// Constraints
// 1 < = N < = 10^9
// Topics
// Java
// Math

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if(((a * a) + (b * b)) == (c * c)){
        //     System.out.print("true");
        // }
        // else{
        //     System.out.print("false");
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);

        if(a2 + b2 == c2){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
public class p73PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
