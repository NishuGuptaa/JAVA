// You have given a number n, representing the size of array arr.
// You are required to print a building representing value of arr using *.
// Input Format
// First line consists of an integer n
// Second line consists of n spaced integers, representing elements of arr
// Output Format
// Output the height of the building represented by the values of array arr using *
// Example 1
// Input
// 7
// 9 3 7 6 2 0 4
// Output
// *
// *
// *               *
// *               *       *
// *               *       *
// *               *       *                       *
// *       *       *       *                       *
// *       *       *       *       *               *
// *       *       *       *       *               *
// Explanation
// Number of stars in each column represents the value of that index of array arr which are tab seprated
// Example 2
// Input
// 5
// 1 2 3 4 5
// Output
//                                 *
//                         *       *
//                 *       *       *
//         *       *       *       *
// *       *       *       *       *
// Explanation
// Number of stars in each column represent the value of that index of array arr which are tab seprated
// Constraints
// 1 <= n <= 1000
// 0 <= arr[i] <= 1000
// Topics
// Arrays
// Array - Basics

import java.util.*;

public class q80Buildings {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    buildings(arr, n);
  }

  public static void buildings(int[] arr, int n) {
    // your code here
    int maxFloor = 0;
    for (int height : arr) {
      if (height > maxFloor) {
        maxFloor = height;
      }
    }
    for(int floor = maxFloor; floor >= 1; floor--){
      for(int i = 0; i < n; i++){
        if(arr[i] >= floor){
          System.out.print("*\t");
        }
        else{
          System.out.print("\t");
        }
      }
      System.out.println();
    }
    
  }
}
