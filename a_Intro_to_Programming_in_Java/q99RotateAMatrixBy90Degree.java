// You are given a n x n 2-D matrix representing an image, rotate the image by 90 degrees (clockwise).
// Input Format
// The first line will contain two integers n and n again.
// The next n lines contain n integers each representing the matrix.
// Output Format
// Return a matrix that is rotated by 90 degrees in the clockwise direction.
// Example 1
// Input
// 2 2 
// 1 2
// 2 3 
// Output
// 2 1 
// 3 2
// Explanation
// We do a 90 degree clockwise rotation of the matrix.
// Example 2
// Input
// 3 3
// 7  2  3 
// 2  3  4 
// 5  6  1 
// Output
// 5 2 7
// 6 3 2
// 1 4 3
// Explanation
// We do a 90 degree clockwise rotation of the matrix.
// Constraints
// 1 <= n <= 100
// Inplace solution
// Topics
// Basics
// 2D Arrays - Basics
// 2D-Arrays
// Companies
// ServiceNow
// Facebook
// ByteDance
// PayTM
// Amazon
// Bloomberg
// Oracle
// Adobe
// Cisco
// Quora
// VMware
// Apple
// Databricks
// Uber
// Google
// Microsoft
// eBay
// Nvidia

import java.io.*;
import java.util.*;

class Solution {
    public int[][] matrixTranspose(int[][] mat, int n) {
       int[][] trans = new int[n][n];
       for(int i = 0; i < n; i++){
        for(int j = 0; j < n ; j++){
            trans[j][i] = mat[i][j];
        }
       }
       return trans;
    }
    public int[][] rotateBy90(int [][]mat) {
        // Your code here
        mat = matrixTranspose(mat, mat.length);
        for(int i = 0; i < mat.length; i++){
            int left = 0;
            int right = mat[0].length - 1;

            while(left < right){
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
        return mat;
    }
}

public class q99RotateAMatrixBy90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        int[][] ans = Obj.rotateBy90(mat);
        for(int i=0; i<n; i++)
        {   for(int j=0; j<n; j++)
                  {
                       System.out.print(ans[i][j] + " ");
                  } System.out.println("");
        }
        System.out.println('\n');
    }
}
