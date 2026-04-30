// Given integers m and n, you must print m lines with n stars each.
// You have to complete lineStars function which consists of integer inputs m and n and prints the required pattern using *.
// Input Format
// The first line of input contains the integer m and n.
// Output Format
// The output should contain m lines, with each line containing n stars each.
// Example 1
// Input
// 4 3
// Output
// ***
// ***
// ***
// ***                                                                    
// Explanation
// Each 4 lines has 3 stars *.
// Example 2
// Input
// 7 1
// Output
// *
// *
// *
// *
// *
// *
// *
// Explanation
// Every line contains a Single star * in each row.
// Constraints
// 1 <= m,n <= 200
// Topics
// Loops
// Basics

import java.util.*;

class Accio {
    public void linesStars(int m, int n) {
        //Write your code here and print output in this function
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class p19LinesandStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Accio Obj = new Accio();
        Obj.linesStars(m, n);
        sc.close();
    }
}
