// Write a Java program to print the given message.You are given a string s which contains name and also an integer age, your task is to print the following message.
// Note
// if the input is Adarsh 20 then print 
// My name is Adarsh. I am 20 years old
// Input Format
// line contains your name s
// second line contains your age
// Output Format
// Print the message
// Example 1
// Input
// Adarsh
// 20
// Output
// My name is Adarsh. I am 20 years old
// Example 2
// Input
// Prachi
// 22
// Output
// My name is Prachi. I am 20 years old
// Constraints
// 1 <= |s| <= 105
// 1 <= age <= 100
// Topics
// Strings
// Java

import java.util.Scanner;

public class p79MessagePrinting2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int age = sc.nextInt();
    // your code here
    System.out.print("My name is " + name + ". I am " + age + " years old");
  }
}
