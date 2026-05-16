// You are given an integer array of fixed size i.e. n is 5. Your task is to find the second largest integer element in the given array.
// Input format
// The First line contains space separated 5 integer elements of the array
// Output format
// Print the second largest integer element from the array.
// Example 1
// Input:
// 5 8 34 54 43
// Output:
// 43
// Explanation
// Here, second largest element is 43
// Example 2
// Input
// 6101 9254 9119 67 832
// Output
// 9119
// Explanation
// Here, second largest element is 9119
// Constraints
// 0 <= arr[i] <= 10^5
// Topics
// Arrays
// Companies
// SAP

import java.io.*;
import java.util.*;
public class p108SecondLargestInteger {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int maxSec = Integer.MIN_VALUE;
        
        for(int i = 0; i < 5; i++){
            if(max < arr[i]){
                maxSec = max;
                max = arr[i];
            }
            else if(maxSec < arr[i]){
                maxSec = arr[i];
            }
        }
        System.out.print(maxSec);
    }
}
