// You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.
// You are required to subtract the numbers represented by two arrays and print the arrays. n1 and n2 can be of different sizes
// You need to calculate arr1 - arr2 (the number represented by arr1 minus the number represented by arr2).
// Input Format
// First line consists of an integer n1
// Second line consists of n1 spaced integers, representing elements of arr1
// Third line consists of an integer n2
// Fourth line consists of n2 spaced integers, representing elements of arr2
// Output Format
// Subtract the two numbers and print the array
// Example 1
// Input
// 3
// 3 2 1
// 3
// 1 2 3
// Output
// 1
// 9
// 8
// Explanation
// 321 - 123 = 198
// Example 2
// Input
// 4
// 1 2 3 4
// 2
// 2 1
// Output
// 1
// 2
// 1
// 3
// Explanation
// 1234 - 21 = 1213
// Constraints
// 1 <= n1, n2 <= 10
// 0 <= a1[i], a2[i] < 10
// Topics
// Number System: Number Problems
// Arrays
// Array - Basics

import java.util.*;

public class q83ArraySubtracting {

  static int[] subtract(int[] n1, int[] n2) {
    List<Integer> sub = new ArrayList<>();
    int i = n1.length - 1, j = n2.length - 1, c = 0;
    while (i >= 0 || j >= 0) {
      int a = i < 0 ? 0 : n1[i--];
      int b = j < 0 ? 0 : n2[j--];
      int sum = a - b + c;
      if (sum < 0) {
        c = -1;
        sum += 10;
      } else {
        c = 0;
      }
      sub.add(sum);
    }

    // Swap num1 and num2, then do it again.
    if (c < 0) {
      int[] tmp = subtract(n2, n1);
      tmp[0] *= -1;
      return tmp;
    }
    Collections.reverse(sub);

    // Remove leading zeros
    int start = 0;
    while (sub.get(start) == 0 && start < sub.size() - 1) start++;
    int[] ans = new int[sub.size() - start];
    for (int k = 0; k + start < sub.size(); k++) {
      ans[k] = sub.get(start + k);
    }
    return ans;
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = subtract(arr1, arr2);
    for (int i : res) System.out.println(i);
  }
}
