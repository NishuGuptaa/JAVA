import java.util.Scanner;

public class a11ParameterizedFunctions {
    public static void printFactorial(int n){
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("N is: " + n);
        printFactorial(n); //argument
        System.out.println("Main Method Ended");
    }
    
}
