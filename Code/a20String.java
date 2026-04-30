import java.util.*;

public class a20String {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = new String("Hello world");

        System.out.println(str);
        System.out.println(str1);

        System.out.println(str.length());
        System.out.println(str1.length());

        System.out.println(str.charAt(6));

        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}
