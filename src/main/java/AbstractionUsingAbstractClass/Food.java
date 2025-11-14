package AbstractionUsingAbstractClass;

//We know by pressing accelarator we can 
//acclarate our vehicle, but here 
//we hide fuel consumption and gear changing mechanism 
//which makes system simple. Thus we achieve simplicity(abstraction) 


//Abstraction: Not detail
//- Achieve Simplicity
//- Can hide details
////- 
////
//We can achieve abstraction by two ways:
//- Abstract Class
//- Interface
//
//
//Abstract Class:
//- uses 'abstract' keyword before class declaration
//- Contains both abstract(no body) and concrete(non-abstract) method
//- We can't create object of abstact class
//- Can contain constructor and instance variable
//- abstract methods of an abstract class 
//        must be implemented(override) by subclasses. 



public abstract class Food {
    int a;
     
    Food(){
        
    }
    Food(String name){
        
    }
    
    abstract void price();//abstract method
    
//    void price(){ //concrete method
//        
//    }
    
    abstract void color();
    void weight(){
        
    }
    
    
    
    
}