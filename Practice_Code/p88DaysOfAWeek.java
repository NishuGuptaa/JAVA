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
// Coding

import java.util.Scanner;

public class p88DaysOfAWeek {
  public static void main(String[] args) {
    //write code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String name;
    switch(n){
      case 1:
        name = "Monday";
        break;
      case 2:
        name = "Tuesday";
        break;
      case 3:
        name = "Wednesday";
        break;
      case 4:
        name = "Thursday";
        break;
      case 5:
        name = "Friday";
        break;
      case 6:
        name = "Saturday";
        break;
      case 7:
        name = "Sunday";
        break;
      default:
        name = "Invalid";
        break;
    }
    System.out.println(name);
  }
}
