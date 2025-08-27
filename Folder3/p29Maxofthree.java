// Pickles have three numbers A, B, C. He wants to find the maximum of given three numbers. Help him achieve the task.
// Input Format
// The first line of input contains an integer 'T' denoting the number of test cases.
// Each of next T lines contains 3 integers A,B,C.
// Output Format
// Print a T integers each in new line denoting the maximum of three numbers for each test case.
// Example 1
// Input
// 3
// 4 8 10
// 1 3 5 
// 78 -9 3
// Output:
// 10
// 5
// 78
// Explanation:
// Maximum of 4,8,10 is 10
// Maximum of 1,3,5 is 5
// Maximum of 78,-9,3 is 78
// Example 2
// Input
// 3
// 4 8 3
// 1 3 2
// 3 3 3
// Output:
// 8
// 3
// 3
// Explanation:
// Maximum of 4,8,3 is 8
// Maximum of 1,3,2 is 3
// Maximum of 3,3,3 is 3
// Constraints
// 1 <= T <= 10
// -10^6 <= a,b,c <= 10^6
// Topics
// Conditionals

import java.util.*;
import java.io.*;

class Solution{
    static int solve(int n,int m,int k){
        //Write code here
        int max;
        if(n > m  && n > k){
            max = n;
        }
        else if(m > n && m > k){
            max = m;
        }
        else{
            max = k;
        }
        return max;
    }
}
public class p29Maxofthree {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i = 0; i < T; i++){
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            System.out.println(Solution.solve(n,m,k));
        }
    }
}
