package Generics;

import java.util.ArrayList;

/**
 *
 * @author KALLOL DAS KUSHOL
 */

/*
Generics -> Generics allows type perameters in classes, interfaces, constructor and methods;

~Instead of writing code for each type (int, String, etc.), we can write Generic version and the compiler replaces it with the required type.

*/

/*
~Generics make code type-safe and remove casting.

~Why ArrayList is relates to Generics?
    =>Because ArrayList itself is a Generic class
(defined as ArrayList<E> in the java library).

~When we write new ArrayList(), we are instantiating a Generic class without specifying the type perameter;

~List -> ArrayList

ArrayList<String>list = new ArrayList<String>(); -> Generics property included
ArrayList<String>list = new ArrayList<>(); -> Both are same. -> Generics property included
ArrayList list1 = new ArrayList(); -> Generics property Excluded -> This disables type safety. Means we can add any type in it.


*/
public class GenericBasic {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(7); // [7]
        list.add("Hello"); // [7, "Hello"]
        
        list.add(list); // [7, "Hello", 7, "Hello"]
        
        list.get(0); // 7

//        int a = list.get(0); -> SYSTEM is not sure that it is int or not
        int a = (int)list.get(0); // 7
        System.out.println(a);
//        int b = (int)list.get(1); // Its a ClassCastException. //It is not possible bcz its a String.
        String b = (String)list.get(1); // Correct
        
        ArrayList<String> list1 = new ArrayList<>();
        
//        list1.add(7); -> Wrong, As it is String type. So it is filtered by compilar -> CompileTime Error for time safety
        list1.add("Hello"); // -> Correct
        
        String c = list1.get(0); // no need of explicit type casting
    
    }
}
