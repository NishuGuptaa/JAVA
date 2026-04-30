// Take two positive integers from the user. Verify if (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.
// Calculate the Left hand side (LHS) and the right hand side (RHS) of the equation. Print the (LHS) and the (RHS).
// Print VERIFIED in uppercase if they are equal, otherwise print NOT VERIFIED.
// Input Format
// The first line contains two integers A and B.
// Output Format
// Print two integers, the LHS and RHS in separate lines.
// Then print "VERIFIED" (without quotes and in uppercase) if they are equal, else print "NOT VERIFIED".
// Example 1
// Input:
// 4 5
// Output:
// 729
// 729
// VERIFIED
// Explanation:
// We have A = 4 and B = 5.
// Since, LHS = 729 and RHS = 729, our equation is Verified.
// Example 2
// Input:
// 1 2
// Output:
// 27
// 27
// VERIFIED
// Explanation:
// We have A = 1 and B = 2.
// Since, LHS = 27 and RHS = 27, our equation is Verified.
// Constraints
// 1 <= A <= 100000
// 1 <= B <= 100000
// Topics
// Math

import java.util.*;

public class p94VerifyCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        // write code here
        long LHS = (long) (Math.pow((a + b), 3));
        System.out.println(LHS);
        long RHS = (long) (Math.pow(a, 3) + Math.pow(b, 3) + 3 * Math.pow(a, 2) * b + 3 * a * Math.pow(b, 2));
        System.out.println(RHS);

        if(LHS == RHS){
            System.out.println("VERIFIED");
        }
        else{
            System.out.println("NOT VERIFIED");
        }
    }
}
