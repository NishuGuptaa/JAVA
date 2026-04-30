// Write a program to print the area of a rectangle
// Note
// You have to print till 4 decimal places.
// Input Format
// First line contains length L.
// Second line contains breadth B.
// Output Format
// Print the area.
// Example 1
// Input
// 4.5 
// 6.2
// Output
// 27.9000
// Example 2
// Input
// 6.0
// 2.5
// Output
// 15.0000
// Constraints
// L, B can be any real number in the range [1,10^4]
// Topics
// Math

import java.util.*;

public class p100RectangleArea {

    public static void main(String[] strings) {
        //write code here
        Scanner sc = new Scanner(System.in);
        double L = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.printf("%.4f", L * B);
    }
}
