package AbstractionUsingAbstractClass;

public class TestAbstraction {
    public static void main(String[] args) {
        //new Food();//Impossible
        Burger burg = new Burger();
        burg.extraIngredients();//
        burg.price();//
        Food f_burg = new Burger();//upcasting
        f_burg.price();
        f_burg.weight();
       
        
    }
}