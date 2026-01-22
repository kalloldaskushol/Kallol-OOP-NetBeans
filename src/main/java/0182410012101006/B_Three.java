class Box<T> {
	private T value;

	Box (T value){
		this.value = value;
	}
	public void setVal(T value){
		this.value = value;
	}
	public T getVal(){
		return this.value;
	}
	
}

public class B_Three{
	public static void main(String[] args){
		Box<String> b1 = new Box<>("Hello");
		Box<Integer> b2 = new Box<>(10);
		
		b1.setVal("Hi");
		b2.setVal(100);
		
		System.out.println("Updated value of String Box: " + b1.getVal());
		System.out.println("Updated value of Integer Box: " + b2.getVal());
	}
}