// Given the marks of n students, your task is to take input of marks, calculate the average of the marks obtained and print it.
// Input Format
// The first number in the input line is the number of students.
// The second line contains n space-separated integers are the marks of the students.
// Output Format
// Print the floor of the average of marks obtained.
// Example 1
// Input
// 5
// 2 2 2 2 2
// Output
// 2
// Example 2
// Input
// 3
// 31 32 33
// Output
// 32
// Constraints
// 1 <= n <= 10000
// 1 <= marks <= 10000
// Topics
// Math
// Arrays

import java.util.*;

class Accio {
    public void AverageCalculator() {
	    //Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + sc.nextInt();
        }
        int avg = sum / n;
        System.out.print(avg);
    }
}

public class p103AverageCalculator {
    public static void main(    String[] args) {

        Accio Obj = new Accio();
        Obj.AverageCalculator();
    }
}