import java.util.*;

public class a25SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4, 8, 7, 1, -2};
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIdx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            // // descending order
            // int maxIdx = i;
            // for(int j = i + 1; j < n; j++){
            //     if(arr[maxIdx] < arr[j]){
            //         maxIdx = j;
            //     }
            // }
            // int temp = arr[i];
            // arr[i] = arr[maxIdx];
            // arr[maxIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
