
package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KALLOL DAS KUSHOL
 */
public class GenericModerate {
    
    <T> void printAtMethodLevel(T val) { // we can use Generic property at method level. -> called GENERIC METHOD
        System.out.println(val);
    }
    
//    Bounded type:
    <T extends Number> void Bounded(T val) { // Now we can't use String for this method.
        System.out.println(val);
    }
    
//    WildCard: -> works for cointainer: Array, List etc..
    void wildCard(List<?> list_name){ // ? means anything is acceptable. //Access for everyone.
        
//        for(Integer i:list){
//            System.out.println(i);
//        } // -> will not work for String
        
        for(Object i : list_name){
            System.out.println(i);
        }
//        list.add("Hello"); // Not Possible bcz WILDCARD is read-only. To ensure type-safety        
    }
    
//    upper bounded wildcard (READ-Only)
    void upperBound(List<? extends Number> list){ // now we can't use String
        
        for(Number i:list){ // Object will also work as it is the superclass
            System.out.println(i);
        }
        
//        list.add(7); -> read-only
    }
    
//    lower bounded wildcard
    void lowerBound(List<? super Integer> list){ // now we can use only those who are equavalent to Integer or its parent
        
        list.add(7);// -> write-able
        
        for(Object i:list){ // Object will also work bcz its the most superclass
            System.out.println(i);
        }
        
    }
    
    
    public static void main(String[] args) {
        GenericModerate obj1 = new GenericModerate();
        
        // obj1.printAtMethodLevel("Hello");
//        obj1.Bounded("Hello"); // Not Possible
        // obj1.Bounded(7);
        
        // Type of a ArrayList must be class (premitive data type will not be accepted)
        ArrayList<Integer> al = new ArrayList<>();
        al.add(7);
        al.add(10);
        
//        ArrayList al2 = new ArrayList();
//        al2.add(7);
//        al2.add("ABCD"); // Will also work but it not ensures type safety

        obj1.upperBound(al);
    }
}
