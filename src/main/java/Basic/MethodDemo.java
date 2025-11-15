package Basic; // Folder Structure

/**
 *
 * @author Kallol Das Kushol
 */
public class MethodDemo {
    String address;
    String first_name;
    String last_name;
    
    void name() {
        System.out.println("I have nothing");
    }
    
    String name (String f_n){ // This is a parameter
        this.first_name = f_n;
        System.out.println("Your first name is: " + f_n);
        return "";
    }
    
    // Two methods are same, if there parameters & name are same. Even if their return types are different.
    String name (String f_n, String l_n){
        System.out.println("Your full name is: " + f_n + " " + l_n);        
        return "";
    }
    
    String getAddress() {
        return address;
    }
    
    public static void main(String[] args) {
        MethodDemo m1 = new MethodDemo();
        m1.name("Kallol", "Das Kushol"); // This is argument
        
        m1.address = "Syl";
        String s = m1.getAddress();
        System.out.println(s);
        
        m1.first_name = "Xamil";
        System.out.println(m1.first_name);
        System.out.println(m1.last_name);
        // 3 ways of how instance variable get their value.
    }
}
