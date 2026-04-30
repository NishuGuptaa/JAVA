// Write a java program to calculate the radius of a circle given it's perimeter. The perimeter of a circle is its boundary or the complete arc length of the periphery of a circle
// Perimeter of a circle = 2 π r = π D units
// where,
// r = radius of the circle D = diameter of the circle.
// Input Format
// Any number representing perimeter of circle
// Output Format
// Return radius of circle
// Example 1
// Input
// 400
// Output
// 63.66197723675813
// Example 2
// Input
// 853
// Output
// 135.75916645738673  
// Constraints
// 1 < = N < = 10^9
// Topics
// Math

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        double perimeter = sc.nextInt();
        double r = perimeter / (2 * Math.PI);
        System.out.print(r);
    }
}
public class p97FindTheRadius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
