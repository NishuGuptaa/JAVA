// You are given an array arr of length n. You have to come up with an in-place solution.
// Input Format
// The first line of input contains an integer n, size of the array.
// The next line contains n space-separated integers denoting the elements of the array.
// Output Format
// Printing is handled by the main function you just have to come up with an inplace solution.
// Example 1:
// Input
// 4
// 1 3 5 7
// Output
// 7 5 3 1
// Explanation
// We have array = [1 3 5 7].
// Print the array from the ending. The reversed array is [7 5 3 1]
// Example 2:
// Input
// 7
// 0 0 1 1 0 2 3
// Output
// 3 2 0 1 1 0 0
// Explanation
// The reversed array is [3 2 0 1 1 0 0].
// Constraints
// 1 <= n <= 10^6
// 1 <= arr[i] <= 10^9
// Topics
// Arrays
// Array - Basics

import java.io.*;
import java.util.*;


public class p33ReverseAnArray {

    public static int[] reverseArray(int arr[])
    {
        //Write code here
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        
        arr1 = reverseArray(arr1);
        
        for (int i = 0; i < n; i++)
             System.out.print(arr1[i] + " ");       
        System.out.println('\n');
    }
}
