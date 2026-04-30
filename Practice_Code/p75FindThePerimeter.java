// Write a java program to calculate the perimeter of a circle given it''s area. The perimeter of a circle is its boundary or the complete arc length of the periphery of a circle and the area of a circle is π multiplied by the square of the radius. The area of a circle(A) when the radius ''r'' is given is πr2
// Area of Cirlce = πr² 
// Perimeter of a circle = 2 π r
// where, r = radius of the circle
// Input Format
// Any number representing area of circle
// Output Format
// Return perimeter of circle
// Example 1
// Input
// 500
// Output
// 79.26654595212023
// Example 2
// Input
// 853
// Output
// 103.53315475753828
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
        double area = sc.nextDouble();
        double radius = Math.sqrt(area / Math.PI);
        double perimeter = 2 * Math.PI * radius;
        System.out.print(perimeter);
    }
}
public class p75FindThePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
