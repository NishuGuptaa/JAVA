// Given an unsorted array of size N find the 2nd largest element from the array without sorting the array.
// Input Format
// The first line contains a single integer N.
// The second line consists of N integers of the array.
// Output Format
// Print the second largest number in the new line.
// Example 1
// Input
// 6
// 3 2 1 5 6 4
// Output
// 5
// Explanation
// 5 is the second largest element of the array.
// Example 2
// Input
// 9
// 10 1 7 2 5 6 8 9 3
// Output
// 9
// Explanation
// 9 is the Second largest element in the array
// Constraints:
// 2 <= N <= 10^5
// -10^5 <= N <= 10^5
// Topics
// Arrays
// Array - Basics

import java.io.*;
import java.util.*;


public class q84SecondLargestFromArray {
    public static void SecondLargest(int[] arr, int n) {
        // Write code here
        //solution 1
        // Arrays.sort(arr);
        // System.out.println(arr[n - 2]);

        //solution 2
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }
}
