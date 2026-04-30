// Write a program to calculate the sum of following series where ''''''''n'''''''' is input by user.
// 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
// Note: Print answer upto 5 decimal places.
// Input Format
// First line of input contains ''''''''n''''''''.
// Output Format
// Print the sum of the series.
// Example 1
// Input
// 10
// Output
// 2.92897
// Example 2
// Input
// 2
// Output
// 1.50000
// Constraints:
// 1 <= n <= 1000
// Topics
// Loops

import java.util.*;

public class p84SeriesProblem {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + 1.0 / i;
        }
        System.out.printf("%.5f", sum);
    }
}
