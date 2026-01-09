//package Exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

/*
	Author: Kallol Das Kushol
*/

public class CheckedException {
	public static void main(String[] args){
		try {
			FileInputStream fs = new FileInputStream("C:/Users/nirjha/Desktop/0182410012101006/Exception/txt.txt");

			//printing chars
			try {
				int ch = fs.read();
				while(ch != -1){
					System.out.print((char) ch);
					ch = fs.read();
				}
			} catch (IOException e) {
				System.out.println("IO Exception Happened");
			}
		} catch (FileNotFoundException e){
			System.out.println("File Not Found!!!!");
		}
	}
}