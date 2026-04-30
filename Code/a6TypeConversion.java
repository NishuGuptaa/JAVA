public class a6TypeConversion {
    public static void main(String[] args){
        //Implict
        int a = 50;
        long b = a;
        System.out.println("Value of b: "+b);

        // long c = 50;
        // int d = c;
        // System.out.println("Value of d: "+d); // Error

        int c = 500;
        float d = c;
        System.out.println("Value of d: "+d);

        int var = 'a';
        System.out.println("Value of var: "+var);

        int var2 = '0';
        System.out.println("Value of var2: "+var2);

        int var3 = 'a' + 10;
        System.out.println("Value of var3: "+var3);

        int var4 = 5 - '5';
        System.out.println("Value of var4: "+var4);

        int var5 = 'a' - 'A';
        System.out.println("Value of var5: "+var5);

        int var6 = '9' - '0';
        System.out.println("Value of var6: "+var6);


        //Explict
        long x = 50;
        int y = (int)x;
        System.out.println(y);

        double z = 3.14;
        int w = (int)z;
        System.out.println(w);

        long m = 999999999999L;
        int n = (int)m;
        System.out.println(n);

        int ch = 97;
        System.out.println(ch);

        int o = 48;
        char p = (char)o;
        System.out.println(p);

        //Type Promotion
        byte e = 10;
        short f = 20;
        char g = 'a'; // a = 97
        System.out.println(e + f + g);

        char h = 'A'; //66
        char h1 = 'B'; //65
        int h2 = h1 - h;
        System.out.println(h2);

        byte k1 = 10;
        byte k2 = 20;
        // byte k3 = k2 + k1;
        byte k3 = (byte)(k2 + k1);
        System.out.println(k3);

        byte a1 = 10;
        long b1 = 20L;
        float c1 = 30.56f;
        double d1 = 40.48;
        // double result = a1 + b1 + c1 + d1;
        System.out.println(a1 + b1 + c1 + d1);
    }
}
