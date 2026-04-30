// The cost of a product in a product based company is rs x and the weight of the product is y gm but after one month due to some change in the product and change in demand the company decided to change the product and now its weight is increased and the price is also different. Calculate average weight and product price
// Note : use double data type
// Input Format
// Take any four values representing old weight, new weight, old price and new price
// Output Format
// Return the average of weight and price
// Example 1
// Input
// 50
// 56
// 20
// 25
// Output
// Average weight is 53 gm
// Average price is 22.5 rs
// Explanation
// The initial two inputs 50 and 56 are representing weight here and their average is 53 while other two inputs 20 and 25 are representing price here and their average is 22.5
// Example 2
// Input
// 60
// 25
// 10
// 16
// Output
// Average weight is 42.5 gm
// Average price is 13 rs
// Explanation
// The initial two inputs 60 and 25 are representing weight here and their average is 42.5 while other two inputs 10 and 16 are representing price here and their average is 13
// Constraints
// 1 < = N < = 10^9
// Topics
// Math

import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
        double  a = sc.nextDouble();
        double  b = sc.nextDouble();
        double  weight = (a + b) / 2;
        double  x = sc.nextDouble();
        double  y = sc.nextDouble();
        double  price = (x + y) / 2;

        System.out.println("Average weight is " + weight + " gm");
        System.out.println("Average price is " + price + " rs");

        // if(weight == (int)weight)
        //     System.out.println("Average weight is " + (int)weight + " gm");
        // else
        //     System.out.println("Average weight is " + weight + " gm");

        // if(price == (int)price)
        //     System.out.println("Average price is " + (int)price + " rs");
        // else
        //     System.out.println("Average price is " + price + " rs");
    }
}
public class p99Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
