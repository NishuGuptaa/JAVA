// Given an array of N integers, count the total pairs of integers that have a difference of K.
// Input Format
// 1st line contains N & K (integers).
// 2nd line contains N numbers of the array.
// Output Format
// One integer - the number of pairs of numbers that have a difference K.
// Example 1
// Input
// 4 1  
// 32 0 63 8
// Output
// 0
// Example 2
// Input
// 5 2
// 1 5 3 4 2  
// Output
// 3
// Explanation Here we have taken 5 numbers and we want pairs of numbers with a difference of 2. The given array is 1 5 3 4 2.
// Pairs having a difference of 2 are: (1,3) (2,4) (3,5) Therefore we got output as 3.
// Constraints
// 1 < n < 1000
// 1 <= arr[i] <= 1e6
// Topics
// Arrays
// Sorting
// Companies
// Facebook
// Amazon

import java.io.*;
import java.util.*;

class Solution {
    public int Pairs(int []arr,int k){
        //your code here
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] - arr[j] == k || arr[j] - arr[i] == k){
                    count++;
                }
            }
        }
        return count;
    }
}

public class q88Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.Pairs(arr,k)); 
    }
}