import java.util.Arrays;

public class a13Array {
    public static void main(String[] args) {
        //Declear
        int[] arr;
        // System.out.println(arr);

        arr = new int[5];
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        //Declear & Initialize
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));

        String[] subjects = {"phy", "chem", "maths", "eng"};
        System.out.println(Arrays.toString(subjects));
        System.out.println(subjects[2]);
        
    }
}
