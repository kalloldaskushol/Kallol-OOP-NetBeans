/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice_Finals;

/**
 *
 * @author KALLOL DAS KUSHOL
 */
public class AgeException extends RuntimeException {

    AgeException(String msg){
        super(msg);
    }
    class voting {
        public static void main(String[] args) {
            int age = 16;
            if(age < 18 ){
                throw new AgeException("can't vote"); 
            } else {
                System.out.println("Vote success");
            }
        }
    }
}
