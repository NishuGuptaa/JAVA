// You are given an array arr of length n. Your task is to print the index of the given target element after sorting the given array arr. Assume that the array contains only unique elements.
// Input Format
// The first line of input contains an integer n, size of the array.
// The next line contains n space seperated integers denoting the elements of the array.
// The next line contains the target element.
// Output Format
// The only line of output contains the index of the target element after sorting the array.
// Example 1
// Input
// 6
// 6 27 2 3 1 5
// 5
// Output
// 3
// Explanation
// We have arr = [6 27 2 3 1 5]
// After sorting arr = [1 2 3 5 6 27]
// Index of 5 is 3
// Example 2
// Input
// 7
// 9 7 19 20 13 1 6
// 6
// Output
// 1
// Explanation
// Sorted array = [1 6 7 9 13 19 20]
// Index of 7 is 1
// Constraints
// 1 <= n <= 10^6
// 0 <= arr[i] <= 10^9
// Topics
// Loops

import java.util.Scanner;
import java.util.Arrays;

public class q140IndexOfTheTargetElementAfterSorting {
   
    static int findIndex(int[] arr, int n, int k) {
        // write your code here
        // // bubble sort
        // for(int i = 1; i < n; i++){
        //     for(int j = 0; j < n - i; j++){
        //         if(arr[j] > arr[j + 1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        
        for(int i = 1; i < n; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Input size of array
        int[] arr = new int[n]; // Declare array of size n

        // Input elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt(); // Input value of k

        // Call the function findIndex and store the result in index
        int index = findIndex(arr, n, k);

        // Output the result
        System.out.println(index);

        scanner.close(); // Close the scanner
    }
}
