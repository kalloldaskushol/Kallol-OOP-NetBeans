package Basic;

/**
 *
 * @author Kallol Das Kushol
 */

import java.util.Scanner;
//import java.util.*; all folder comes if we give *


// There must have a public (actually only public class) class in a java and the class name must be similar to the class name


public class InputExample {
    public static void main(String[] args) {
        System.out.println("Start.....");
        int a;
        int b;
        // System.in -> takes input as Byte
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        
        float c = sc.nextFloat();
        System.out.println(c);
        
        // char is different;
        // abc is a char then ->
        char ch = sc.next().charAt(0); // a
        char ch_1 = sc.next().charAt(1); // b
        
        System.out.println(ch);
        System.out.println(ch_1);
        
        sc.nextLine();// to avoid the \n.
        
        String s = sc.nextLine();
        System.out.println(s);
    }
}