import java.util.*;
public class a17LinearSearch {
    public static int linearSearch(int[] arr, int target){
        //front
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == target){
        //         return i;
        //     }
        // }
        // return -1;

        //Back
        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(nums));
        int target = sc.nextInt();
        int index = linearSearch(nums, target);

        if(index == -1){
            System.out.println("Element not found " + target);
        }
        else{
            System.out.println("Element found at index " + target + ": " + index);
        }
    }  
}
