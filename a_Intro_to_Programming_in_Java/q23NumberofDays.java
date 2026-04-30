// Given the number of the month, your task is to calculate the number of days present in the particular month.
// Note:- Consider non-leap year.
// Input Format
// An integer M, denoting the number of the month.
// Output Format
// Return the number of days in the month corresponding to the given number. Consider a non-leap year.
// Example 1
// Input
// 1
// Output
// 31
// Explanation
// January has 31 days.
// Example 2
// Input
// 3
// Output
// 31
// Explanation
// March has 31 days.
// Constraints
// 1 <= M <= 12
// Topics
// Conditionals

import java.util.*;

public class q23NumberofDays {
    public static void main(String[] args) throws Throwable {
        //Write your code here
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month == 2){
            System.out.println(28);
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println(30);
        }
        else{
            System.out.println(31);
        }
    }
}
