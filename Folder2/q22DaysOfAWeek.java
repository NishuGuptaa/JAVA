// Write a program that takes a number n and displays the name of the weekday, if n is >7 print Invalid
// Input Format
// First line contain a number n
// Output Format
// Print the name of the weekday. Print Invalid if the number is greater than 7.
// Example 1
// Input
// 1
// Output
// Monday
// Example 2
// Input
// 8
// Output
// Invalid
// Constraints
// 1 <= n <= 10^9
// Topics
// Conditionals
// Basics

import java.util.Scanner;

public class q22DaysOfAWeek {
  public static void main(String[] args) {
    //write code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    switch(n){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid");
    }
  }
}
