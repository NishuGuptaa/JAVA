// Write a program to find out the shortest distance between two even positive integers in an array arr and print the distance. If there is one or zero even positive integer in the array then return -1.
// Note that if the index of one even positive integer is i and the index of another even positive integer is j then their distance will be |i-j|.
// Input Format
// First line contains n which is the size of the array.
// Second line contains n elements of the array.
// Output Format
// Return the shortest distance if more than one even positive integer is present or return -1 if only one or no even positive integer is present.
// Example 1
// Input
// 2
// 1 2
// Output
// -1
// Explanation
// There is only 1 even positive integer in the array. So the output will be -1.
// Example 2
// Input
// 5
// 2 4 1 6 7
// Output
// 1
// Explantion
// Distance between 2 and 4 is 1,  
// distance between 2 and 6 is 3,  
// distance between 4 and 6 is 2.   
// So the shortest distance is 1.
// Constraints
// 0 <= n <= 10^5
// -10^9 <= arr[i] <= 10^9
// Topics
// Loops
// Basics
// Arrays
// Array - Basics
// Math

import java.util.*;

public class q85ArrayProblem6 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem6(int n, int[] arr){
        // Write code here
        int minDist = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0 && arr[i] % 2 == 0){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[j] > 0 && arr[j] % 2 == 0){
                        int dist = j - i;
                        minDist = Math.min(minDist, dist);
                    }
                }
            }
        }
        if (minDist == Integer.MAX_VALUE){
            return -1;
        }
        return minDist;
    }
}
