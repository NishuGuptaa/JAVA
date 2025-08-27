// You are given an integer array nums of size n where the largest integer is unique. Your task is to determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, print the index of the largest element, or print -1 otherwise.
// Input Format
// The first line of the input contains the number n(length of the array),
// The next line contains n space separated integers denoting the elements of the array.
// Output Format
// Print the index of the element if it satisfies the condition else print -1
// Example 1
// Input
// 4
// 3 6 1 0
// Output
// 1
// Explanation
// Here, 6 is the largest integer, and for every other number in the array x, 6 is more than twice as big as x. The index of value 6 is 1, so we return 1
// Example 2
// Input
// 4
// 1 2 3 4
// Output
// -1
// Explanation
// 4 isn't at least as big as twice the value of 3, so we return -1.
// Constraints
// 1 <= n <= 50
// 0 <= nums[i] <= 100
// The largest element in nums is unique.
// Topics
// Arrays
// Array - Basics

import java.util.*;

class Solution {
    public int LargestElement(int[] nums, int n) {
        // Write your code here
        int firstLargest = Integer.MIN_VALUE;
        int index = -1;
        int secondLargest = Integer.MIN_VALUE;
        for(int j = 0; j < n; j++){
            if(nums[j] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = nums[j];
                index = j;
            }
            else if(nums[j] > secondLargest){
                secondLargest = nums[j];
            }
        }
        if (firstLargest >= 2 * secondLargest) {
            return index;
        }
        return -1;
    }
}

public class q87LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution Obj = new Solution();
        System.out.println(Obj.LargestElement(nums, n));
    }
}
