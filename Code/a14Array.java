import java.util.Arrays;
import java.util.Scanner;

public class a14Array {
    public static void main(String[] args) {
        // int[] marks = new int[5];
        // System.out.println(Arrays.toString(marks));

        // marks[0] = 30;
        // marks[1] = 40;
        // marks[2] = 55;
        // marks[3] = 65;
        // marks[4] = 70;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // for(int j = 0; j < marks.length; j++){
        //     marks[j] = j + 1;
        // }

        // for(int i = 0; i < marks.length; i++){
        //     System.out.print(marks[i]);
        // }
        // System.out.println();

        // for(int val : marks){
        //     System.out.println(val);
        // }
        // System.out.println(Arrays.toString(marks));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int val : nums){
            System.out.print(val + " ");
        }
        System.out.println();

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        for(int val : nums){
            System.out.print(val + " ");
        }
        
    }
}
