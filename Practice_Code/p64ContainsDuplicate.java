// You are given an integer array arr of size n. Find if the array contains any duplicates.
// Input Format
// The first line of input contains the integer n i.e. size of the array
// The next line contains n spaced array integers.
// Output Format
// For each test case , print true if duplicates are present or print false if duplicates are not present.
// Example 1
// Input
// 4
// 1 2 3 1
// Output
// true
// Explanation
// 1 is duplicate here.
// Example 2
// Input
// 4
// 1 2 3 4
// Output
// false
// Explanation
// No duplicate present.
// Constraints
// 1 <= n <= 10^4
// 0 <= arr[i] <= 10^5
// Topics
// Hashing
// Arrays
// Companies
// Facebook
// Amazon
// Google
// Microsoft

import java.util.*;

class Accio {
    public void duplicates(int[] arr) {
        // Write code and print output here
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print("true");
                    return;
                }
            }
        }
        System.out.print("false");
    }
}

public class p64ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        Obj.duplicates(arr);
        sc.close();
    }
}
