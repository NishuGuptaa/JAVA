// Given a matrix of size r*c, where r is number of rows and c is number of columns. Traverse the matrix in spiral form.
// Input Format
// Input consists of two lines
// The first line contains two integers r and c which denotes number of rows and columns respectively.
// The next r lines contains c spaced integers, which are the elements of the matrix.
// Output Format
// Print the spiral matrix.
// Example 1
// Input
// 4 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// Output
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
// Explanation:
// We iterate spirally and print each element.
// Example 2
// Input
// 3 4  
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// Output
// 1 2 3 4 8 12 11 10 9 5 6 7
// Explanation:
// We iterate spirally and print each element.
// Constraints
// 1 <= r, c <= 100
// 0 <= matrix[i][j] <= 100
// Topics
// 2D Arrays - Basics
// 2D-Arrays
// Companies
// PayTM
// Adobe
// MAQ Software
// Oyo Rooms
// Flipkart
// Snapdeal
// MakeMyTrip
// Nagarro
// DE Shaw
// Microsoft
// Morgan Stanley
// Salesforce

import java.io.*;
import java.util.*;

public class q105SpirallyTraversingAMatrix {
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

        spirallyTraverse(mat);     
        System.out.println('\n');
    }

    public static void spirallyTraverse(int [][]mat) {
        // your code here
        int n = mat.length;
        int m = mat[0].length;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                System.out.print(mat[top][j] + " ");
            }
            top++;

            for(int i = top; i <= bottom; i++){
                System.out.print(mat[i][right] + " ");
            }
            right--;

            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    System.out.print(mat[bottom][j] + " ");
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}
