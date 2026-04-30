import java.util.*;

public class a21String {
    public static void main(String[] args) {
        // concatenation
        String firstName = "Radhe";
        String lastname = "Krishn";
        String fullname = firstName + " " + lastname;
        System.out.println(fullname);
        System.out.println(firstName + lastname);


        String str = "hello";
        System.out.println(str);
        str += ' ';
        str += 'w';
        str += 100;
        System.out.println(str);

        // substring
        String str1 = "abcd";
        System.out.println(str1.substring(1,3));
        System.out.println(str1.substring(0,4));

        for(int i = 0; i < str1.length(); i++){
            for(int j = i + 1; j <= str1.length(); j++){
                System.out.println(str1.substring(i, j));
            }
        }

        // split
        String str2 = "abc def ghi jkl mno";
        String[] parts = str2.split(" ");
        for(int i = 0; i < parts.length; i++){
            System.out.println(parts[i]);
        }

        // comparison
        String str3 = "Sita";
        String str4 = "Sita";
        String str5 = new String("Sita");

        if(str3 == str4){
            System.out.println("str3 and str4 are equal");
        }
        else{
            System.out.println("str3 and str4 are not equal");
        }

        if(str3 == str5){  // == operator
            System.out.println("str3 and str5 are equal");
        }
        else{
            System.out.println("str3 and str5 are not equal");
        }

        if(str3.equals(str5)){  // .equals method
            System.out.println("str3 and str5 are equal");
        }
        else{
            System.out.println("str3 and str5 are not equal");
        }
    }
}
