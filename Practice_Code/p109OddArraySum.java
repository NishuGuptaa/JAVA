// Given an integer array of size n. Your task is to calculate the sum of all the odd integers present in the array.
// Input Format
// First line contains an integer n i.e. size of the array
// Second line contains n space separated integer denoting the elements of the array.
// Output Format
// Print the sum of all the odd integers present in the array.
// Example 1
// Input
// 4
// 1 2 3 4 
// Output
// 4 
// Explanation
// Here, 1 + 3 is 4
// Example 2
// Input
// 4
// 2 4 6 8
// Output
// 0
// Explanation
// Here, no odd integer is there.
// Constraints
// 1<=n<=1000
// 1<=arr[i]<=10000
// Topics
// Arrays

import java.util.*;

class Accio{
    static int OddArraySum(int n, int[] arr){
        //Write code here
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}

public class p109OddArraySum {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans = obj.OddArraySum(n,arr);
        System.out.println(ans);
    }
}
