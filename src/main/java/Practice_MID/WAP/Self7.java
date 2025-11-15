package Practice_MID.WAP;
class UniversityID {
    String studentName;
    String idNumber;
    private double cgpa;

    // constructor
    UniversityID(String studentName, String idNumber) {
        this.studentName = studentName;

        // ID must be exactly 8 digits
        if (idNumber.length() == 8) {
            this.idNumber = idNumber;
        } else {
            this.idNumber = "INVALID";
            System.out.println("❌ Invalid ID! Must be 8 digits.");
        }

        // default CGPA before setting
        this.cgpa = 0.0;
    }

    // setCGPA() validates 0.0 – 4.0
    public void setCGPA(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("❌ Invalid CGPA! Allowed range: 0.0 – 4.0");
        }
    }

    // scholarship eligibility
    public boolean isEligibleScholarship() {
        return cgpa > 3.75;
    }

    // display info
    public void printInfo() {
        System.out.println("Name: " + studentName + 
                           " | ID: " + idNumber + 
                           " | CGPA: " + cgpa);
    }
}


public class Self7 {
    public static void main(String[] args) {

        // Student 1: valid ID, valid CGPA
        UniversityID s1 = new UniversityID("Roni", "12345678");
        s1.setCGPA(3.90);

        // Student 2: invalid ID, invalid CGPA
        UniversityID s2 = new UniversityID("Siam", "9999"); // invalid ID
        s2.setCGPA(4.8); // invalid CGPA
        s2.setCGPA(3.40); // valid retry

        // print details
        s1.printInfo();
        System.out.println("Scholarship Eligible: " + s1.isEligibleScholarship());

        System.out.println("---------------------------------------");

        s2.printInfo();
        System.out.println("Scholarship Eligible: " + s2.isEligibleScholarship());
    }
}
