import java.util.*;

public class a9Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //for loop
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // for(int ptr1 = 1, ptr2 = 10; ptr1 < ptr2; ptr1++, ptr2--){
        //     System.out.println("ptr1 --> " + ptr1 + "ptr2 --> " + ptr2);
        // }

        // int n = sc.nextInt();
        // for( ; n >= 1; n--){
        //     System.out.println(n);
        // }

        // for( ; n >= 1; ){
        //     System.out.println(n);
        //     n--;
        // }

        //while loop
        System.out.println("While loop");
        int n = sc.nextInt();
        while(n >= 1){
            System.out.println(n);
            n--;
        }

        int ptr1 = 1;
        int ptr2 = 10;
        while(ptr1 < ptr2){
            System.out.println("ptr1 --> " + ptr1 + "ptr2 --> " + ptr2);
            ptr1++;
            ptr2--;
        }

        //do-while loop
        System.out.println("Do-while loop");
        int count = 0;
        do{
            System.out.println(count + " " + "hello world");
            count++;
        }
        while(count <= 5);
    }
}
