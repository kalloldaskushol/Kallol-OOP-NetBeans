import java.util.Scanner;
import java.util.InputMismatchException;

public class TestThreeI {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		try {
			int age = sc.nextInt();
		} catch (InputMismatchException e){
			System.out.println(e.getMessage());
			System.out.println("Wrong Input Type!!!!");
		}
	}
}