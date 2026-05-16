// Write a Java program to compute body mass index (BMI).
// BMI: The BMI is defined as the body mass divided by the square of the body height, and is universally expressed in units of kg/m2, resulting from mass in kilograms and height in metres.
// Note :
// Use double data type.
// To convert weight from pound to kg multiply by 0.45359237.
// To convert height from inch to metre multiply by 0.0254.
// Input Format
// Two values, representing the input weight in pounds and height in inches.
// Output Format
// Return an Body Mass Index in units of kg/m2.
// Example 1
// Input
// 452
// 72
// Output
// 61.30159143458721
// Example 2
// Input
// 522
// 79
// Output
// 58.80505056427516
// Constraints
// 1 < = N < = 100000
// Topics
// Math
// Java

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Solution {
    public void solve(Scanner sc) {

        double weightPound = sc.nextDouble();
        double heightInches = sc.nextDouble();

        double POUNDS_TO_KG = 0.45359237;
        double INCHES_TO_METERS = 0.0254;

        // double weightKg = weightPound * POUNDS_TO_KG;
        // double heightMeter = heightInches * INCHES_TO_METERS;

        // double BMI = weightKg / Math.pow(heightMeter, 2);
        // double BMI = weightKg / (heightMeter * heightMeter);
        double BMI = (weightPound * POUNDS_TO_KG) / (heightInches * INCHES_TO_METERS * heightInches * INCHES_TO_METERS);

        System.out.print(BMI);

    }
}

public class p105BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
