// You are given two numbers m and n, you are required to print all the Armstrong Numbers between m and n (both inclusive).
// Armstrong Numbers are numbers those have the sum of their own digits raised to the power number of digits equals the number itself. Eg. 153 = 13 + 53 + 33, so 153 is an Armstrong number.
// Input Format
// First line contains two integers m and n
// Output Format
// Print all the Armstrong numbers between m and n in a single line with space   in between.
// Example 1
// Input
// 0 160
// Output
// 0 1 2 3 4 5 6 7 8 9 153
// Constraints
// 0 <= m <= n <= 105
// Topics
// Math
// Number System: Number Problems

import java.util.*;

public class p54ArmstrongNumbersInRange {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = n; i <= m; i++){
			int original = i;
			int sum = 0;
			int digit = 0;
			int temp = i;

			
			if(temp == 0){
				digit = 1;
			}
			else{
				while(temp != 0){
					digit++;
					temp = temp / 10;
				}
			}

			temp = i;
			while(temp != 0){
				int rem = temp % 10;
				temp = temp / 10;
				sum = (int)(sum + Math.pow(rem, digit));
			}
			if(sum == original){
				System.out.print(original + " ");
			}
		}
        
    }
}
