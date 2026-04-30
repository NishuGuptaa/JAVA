public class a12MultipleParameter {
    public static void swap(int a, int b){
        System.out.println("Before Swap: a " + a + " b " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a " + a + " b " + b);
    }
    public static void main(String[] args){
        int a = 10;
        int b = 12;
        System.out.println("Before Calling Swap: a " + a + " b " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        swap(a,b);
        System.out.println("After Calling Swap: a " + a + " b " + b);
    }
}
