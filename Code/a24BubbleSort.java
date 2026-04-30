import java.util.*;
public class a24BubbleSort {
    public static void main(String[] args) {
        // tc-->O(n^2) and sc-->O(1)
        int arr[] = {4, 8, 7, 1, -2};
        int n = arr.length;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){  //for(int j = 0; j < n - 1; j++)
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                // // descending order
                // if(arr[j] < arr[j + 1]){
                //     int temp = arr[j];
                //     arr[j] = arr[j + 1];
                //     arr[j + 1] = temp;
                // }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
