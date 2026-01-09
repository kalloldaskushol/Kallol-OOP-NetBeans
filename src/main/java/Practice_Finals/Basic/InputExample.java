// package Basic;

/*
	Author: Kallol Das Kushol
*/

import java.util.Scanner;

public class InputExample{
	public static void main (String[] args){
		System.out.println("Programing Starting.....");
		
		int a, b;
		
		// building Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Taking Integer input:
		a = sc.nextInt();
		System.out.println("Value of a : " + a);
		
		b = sc.nextInt();
		System.out.println(b);
		
		// Taking Float input:
		float c = sc.nextFloat();
		System.out.println(c);
		
		//Taking char input
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(1);
		
		System.out.println(ch1);
		System.out.println(ch2);
  		
		sc.nextLine(); // To collect the \n
		// Taking String input
		String s = sc.nextLine();
		
		System.out.println(s);
	}
}