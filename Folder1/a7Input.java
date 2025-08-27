// import java.util.Scanner;
import java.util.*;
public class a7Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        long phoneNo = sc.nextLong();
        double weight = sc.nextDouble();
        boolean isEligible = sc.nextBoolean();
        System.out.println("You are " + age + " years old");
        System.out.println("Your phone number is " + phoneNo);
        System.out.println("Your weight is " + weight);
        System.out.println("Is Eligible " + isEligible);
    }
}
