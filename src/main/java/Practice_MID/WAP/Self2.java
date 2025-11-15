package Practice_MID.WAP;

/**
 * @author Kallol Das Kushol
 */
class Emp {
    private String name;
    private double salary;
    private int joinYear;

    Emp(){} // MUST as we made par-cons
    
    Emp(String name, double sal, int join){
        this.name = name;
        this.salary = sal;
        this.joinYear = join;
    }
    //Getter
    public double getSal() {
        return this.salary;
    }
    //Setter
    public void setSal(double n){
        if(n<3000) System.out.println("Not Allowed");
        else{
            this.salary = n;
            System.out.println("Succesfull");
        }
    }
    //exp
    public int exp(int curr_year){
        return (curr_year - this.joinYear);
    }
    // static method so that i can call it by class name
    public static void print_info(Emp a){
        System.out.println(a.name);
        System.out.println(a.salary);
        System.out.println(a.joinYear);
    }
}
public class Self2 {

    public static void main(String[] args) {
        Emp e1 = new Emp("abc", 50000, 2015);
        Emp e2 = new Emp("xyz", 100000, 2010);
        
        e1.setSal(10000);
        e2.setSal(100);
        
        Emp.print_info(e1);
        Emp.print_info(e2);        
    }
}
