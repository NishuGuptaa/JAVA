// Given the temperature of a city in Celsius (C) represented by the variable tempInCelsius, your task is to convert the temperature to Fahrenheit (F) and print it.
// Formula : (C* (9/5)) + 32 = F
// Note: It is guaranteed that the temperature in Celsius, tempInCelsius, will be a multiple of 5.
// Input Format
// An integer tempInCelsius, represents the temperature in Celsius which is a multiple of 5.
// Output Format
// Print an integer containing the converted temperature in Fahrenheit.
// Example 1
// Input
// 25
// Output
// 77
// Explanation
// 25 * 9/5 + 32 = 77
// Example 2
// Input
// -40
// Output
// -40
// Explanation
// -40 * 9/5 + 32 = -40
// Constraints
// -1000 <= tempInCelsius <= 1000
// Topics
// Basics
// Java
// Math

import java.util.*;

public class q14CelsiustoFahrenheit {
    public static void main(String[] args) {
        //Write your code here 
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int F =  (int)(C* (9.0/5)) + 32;
        System.out.println(F);

    }
}