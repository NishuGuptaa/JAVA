// Given an number n, print the nth row of the Pascal's triangle.
// Pascal Triangle
// Your task is to complete the function pascalTriangleRow which receives n as the parameter and returns the nth row of the pascal's triangle.
// Input Format
// There is a single line of input representing n.
// Output Format
// Return the nth row of the Pascal’s triangle
// Example 1
// Input
// 4
// Output
// 1 3 3 1
// Explanation
// The elements in the 4rd row are 1 3 3 1.
// Example 2
// Input
// 1
// Output
// 1
// Explanation
// The elements in the 1st row are 1.
// Constraints
// 1 <= n <= 30
// Topics
// Math
// Companies
// Amazon
// Adobe
// Microsoft

import java.util.*;

public class q114PascalsTriangleII {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> triangle = pascalTriangleRow(n);
        for (int i = 0; i < triangle.size(); i++) {
            System.out.print(triangle.get(i) + " ");
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

	public static ArrayList<Integer> pascalTriangleRow(int numRows) {
        // write code here
       ArrayList<Integer> triangle = new ArrayList<>();
       int rowIndex = numRows - 1;
        for(int i = 0; i <= rowIndex; i++){
            triangle.add(nCr(rowIndex, i));
        }
        return triangle;
    }
}
