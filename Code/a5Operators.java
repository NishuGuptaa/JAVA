import java.util.*;
public class a5Operators {
    public static void main(String[] args){
        int a = 30, b = 12;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        System.out.println(3 / 2);
        System.out.println(-5 / 3);
        System.out.println(3.0 / 2);
        System.out.println(6 / 8.0);
        System.out.println(5.0 / 3.0);
        c = a % b;
        System.out.println(c);

        //Modulo Operator
        System.out.println(8 % 4);
        System.out.println(10 % 6);
        System.out.println(-10 % 6);
        
        //+ Operator
        System.out.println(15 + 30);
        System.out.println(15.0 + 30);
        System.out.println("15 + 30");
        System.out.println("15" + "30");
        System.out.println("a" + "B");
        System.out.println(15 + "B");
        System.out.println("15" + 30);
        System.out.println(15 + "30");
        System.out.println(15 + 30 + "15 + 30" + 15 + 30);

        //Unary Operators
        int x = 10;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

        int y = 10;
        System.out.println(y--);
        System.out.println(y);
        System.out.println(--y);
        System.out.println(y);

        //Assignment Operator
        int z = 10;
        // z = z + 5;
        z += 5;
        System.out.println(z);
        int n = 10;
        n *= 5;
        System.out.println(n);
        int m = 10;
        m /= 5;
        System.out.println(m);
        int o = 10;
        o -= 5;
        System.out.println(o);

        //Relational Operators
        int a1 = 10;
        int a2 = 20;
        System.out.println(a1 == a2);
        System.out.println(a1 != a2);
        System.out.println(10 != 10);
        System.out.println(a1 > a2);
        System.out.println(a1 < a2);
        System.out.println(a1 >= a2);
        System.out.println(a1 <= a2);
        System.out.println(10 >= 10);

        //Logical Operators
        //AND
        System.out.println((3 > 2) && (15 < 10)); //t && f = F
        System.out.println((3 > 12) && (5 < 10)); //f && t = f
        System.out.println((3 > 2) && (15 > 10)); //t && t = t
        System.out.println((3 > 12) && (15 < 10)); //f && f = f

        //OR
        System.out.println((3 > 5) || (5 < 10)); //f || t = t
        System.out.println((3 > 5) || (5 > 10)); //f || f = f
        System.out.println((3 < 5) || (5 > 10)); //t || f = t
        System.out.println((3 < 5) && (5 < 10)); //t || t = t

        //NOT
        System.out.println(!(3 < 2)); //f --> t
        System.out.println(!(3 > 2)); //t --> f

        //Precedence and Associativity
        System.out.println(5 + 2 * 10); // *, +
        System.out.println(10 / 5 + 2 * 10); // /, *, +

        int m1 = 2, m2 = 4, m3 = 6, m4 = 9, m5 = 12;
        int exp = 4 / 3 * m4 + 34 + 9 * m1 + m2 * m3 + 3 + m5 * 2 + m1 / m1 + m2 * m5;
        System.out.println(exp);

        int n1, n2, n3;
        n1 = n2 = n3 = 2;
        n1 += n2;
        n2 -= n3;
        n3 *= n1 + n2;
        System.out.println(n1 + " " + n2 + " " + n3);

    }
}
