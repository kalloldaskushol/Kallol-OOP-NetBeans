package AbstractionUsingAbstractClass;


public class Burger extends Food {
     
    Burger(){
        super();
    }
    @Override
    void price(){
        System.out.println("Price of Burger");
    }
 
    @Override
    void color(){
        System.out.println("Color of Burger");
    }
    
    void extraIngredients(){
        System.out.println("Extra Ingredients of Burger");
    }
}