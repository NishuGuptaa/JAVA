import java.util.Arrays;

public class a15SallowDeepCopy {
    public static void main(String[] args) {
        // int[] arr = {2, 5, 6, 1, 9};
        // System.out.println(Arrays.toString(arr));
        // int[] nums = arr; //shallow copy
        // nums[0] = 99;
        // nums[3] = 33;
        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(arr));

        int[] arr1 = {2, 5, 6, 1, 9};
        System.out.println(Arrays.toString(arr1));
        int[] nums1 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) { //deep copy
            nums1[i] = arr1[i];
        }
        nums1[0] = 99;
        nums1[3] = 33;
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(arr1));
    }
}
