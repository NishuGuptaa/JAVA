// Write a Java program to print the given message.
// Input Format
// -line contains your name
// Output Format
// - Print the message
// Expalnation
// -if the input is Adarsh 
// -then print 
// My name is Adarsh. I like to code.
// Example 1 Input
// Adarsh
// Output
// My name is Adarsh. I like to code.
// Example 2 Input
// Prachi
// Output
// My name is Prachi. I like to code.
// Topics
// Strings
// Java

import java.util.*;

public class p77MessagePrinting {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print("My name is " + str + ". I like to code.");
    }
}
