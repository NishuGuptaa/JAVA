// Given an sorted array A of size N. Find number of elements which are less than or equal to B.
// NOTE: Expected Time Complexity O(log N)
// Your task is to complete the function smallerEqual which receives the input array and B as parameters and returns the number of elements which are less than or equal to B.
// Input Format
// The first line given is an integer N, denoting the size of array A.
// The second line given is an integer array A of size N.
// The third line given is an integer B.
// Output Format
// Print an integer denoting the number of elements which are less than or equal to B.
// Example 1
// Input
// 5
// 1 3 4 4 6
// 4
// Output
// 4
// Explanation: Elements (1, 3, 4, 4) are less than or equal to 4.
// Input
// 4
// 1 2 5 5
// 3
// Output
// 2
// Explanation: Elements (1, 2) are less than or equal to 3.
// Constraints
// 1 <= N <= 10^6
// 1 <= A[i], B <= 10^9
// Topics
// Binary Search
// Arrays
// Companies
// Nutanix
// TCS
// Ola

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
  public static int smallerEqual(int[] A, int B) {
    // write code here
    int count = 0;
    for(int i = 0; i < A.length; i++){
      if(A[i] <= B){
        count++;
      }
    }
    return count;
  }
}

public class p110SmallerOrEqualElements {

  public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] A = new int[n];
	  for(int i=0;i<n;i++){
          A[i] = sc.nextInt();
	  }
	  int B = sc.nextInt();
      Solution Obj = new Solution();
      System.out.println(Obj.smallerEqual(A,B));
	}
}
