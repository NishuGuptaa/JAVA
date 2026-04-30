import java.util.*;
public class a8ConditionalStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
        System.out.println("End");

        
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }

}
