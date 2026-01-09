
class InsufficientFundsException extends Exception{
	
	InsufficientFundsException(){}
	InsufficientFundsException(String s){
		super(s);
	}
}

class Wallet {
	double balance;
	
	Wallet() {}
	Wallet(int balance) {  this.balance = balance;	}
	
	public void spend(int amount)  throws InsufficientFundsException{
		if(amount <= balance){
			this.balance -= amount;
			System.out.println("Updated balance: " + balance);
		} else {
			throw new InsufficientFundsException("Insufficient Funds Exception!!!!!");
		}
	}
}

public class TestThreeII {
	public static void main(String[] args){
		Wallet wallet = new Wallet(500);

	try{
		wallet.spend(100);
		wallet.spend(1000);
	} catch( InsufficientFundsException e){
		System.out.println(e.getMessage());
	}

	}

}