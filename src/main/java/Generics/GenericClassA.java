package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KALLOL DAS KUSHOL
 */

public class GenericClassA<T> {
    
    T aa;
    void setValue(T n){
        this.aa = n;
    }
    T getValue(){
        return this.aa;
    }
    
    // FOR ARRAYLIST
    
    List<T>list_containner = new ArrayList<>();
    
    void addToList(T v){
        list_containner.add(v);        
    }
    
    T getFromList(int idx){
        
        return list_containner.get(idx);
    }
    
    public static void main(String[] args) {
        
        GenericClassA obj1 = new GenericClassA();
        
//        obj1.setValue(7);
        obj1.setValue("Hello"); // not possible if <T> is not used. If not used then it would have taken it as wrong type inserting.
//        System.out.println(obj1.getValue());
        
        GenericClassA<String> obj2 = new GenericClassA<> ();
        
        obj2.addToList("Hello");
        obj2.addToList("World!");
//        obj2.addToList(7);
        System.out.println(obj2.getFromList(1));
    }
}
