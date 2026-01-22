import java.util.ArrayList;

class Cart {
	
	private ArrayList<Double> prices = new ArrayList<>();
	
	//add an item price
	public void addItem(double p){
		prices.add(p);
		System.out.println("Added: " + p);
	}
	
	//remove prices
	public void removeItem(double p){
		boolean removed = prices.remove(p);
		
		if(removed){
			System.out.println("removed: " + p);
		} else {
			System.out.println("Item not found matching the price");
		}
	}

	//Calculating Total:
	public double getTotal(){
		double total = 0;
		for(double p : prices){
			total += p;
		}
		return total;
	}
}

public class TestTwo {
	public static void main (String[] args){
		Cart cart = new Cart();
		
		//adding 3 items:
		cart.addItem(12.2);
		cart.addItem(18.8);
		cart.addItem(19);
		
		//removeItem
		cart.removeItem(12.2);
		
		//Display total:
		System.out.println("Total: " + cart.getTotal());
	}
}