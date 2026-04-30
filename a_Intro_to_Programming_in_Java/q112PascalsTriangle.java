// You are given a number n, you are required to print the first n rows of the pascal triangle.
// Pascal Triangle
// Your task is to complete the function pascalTriangle which receives n as the parameters and returns a 2D array containing the first n rows of the pascal's triangle.
// Input Format
// You are given a single integer n representing the number of rows of pascal's triangle.
// Output Format
// Print n lines of output, where ith line represents the ith row of the triangle.
// Example 1
// Input
// 3
// Output
// 1
// 1 1
// 1 2 1
// Example 2
// Input
// 5
// Output
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// Constraints:
// 1<= n <= 30
// Topics
// Math
// Companies
// Samsung
// Amazon
// Goldman Sachs
// Twitter
// Bloomberg
// Adobe
// VMware
// Apple
// Uber
// Google
// Microsoft
// Yahoo

import java.util.*;

public class q112PascalsTriangle {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static int nCr(int n, int r){
        int res = 1;
        for(int i = 0; i < r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        // write code here
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                list.add(nCr(i, j));
            }
            triangle.add(list);
        }
        return triangle;
    }
}
