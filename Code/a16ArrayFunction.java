import java.util.Arrays;

public class a16ArrayFunction {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 9;
        arr[1] = 78;
        arr[2] = 66;
        arr[3] = 200;
        arr[4] = 45;
        System.out.println("Before Swap" + Arrays.toString(arr));
        swap(arr, 1, 4);
        System.out.println("After Swap" + Arrays.toString(arr));
    }
}
