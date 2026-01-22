abstract class Course {
    abstract double calculateFee();
}

class OnlineCourse extends Course {
    @Override
    double calculateFee() { return 4000.00; }
}

class OfflineCourse extends Course {
    @Override
    double calculateFee() {	return 5000.00; }
}

public class Main1 {
    public static void main(String[] args) {
		
        Course[] courses = new Course[2];  //creating an array of Course references
        courses[0] = new OnlineCourse();
        courses[1] = new OfflineCourse();

        for (Course c : courses) {
            System.out.println("Course Fee: " + c.calculateFee());
        }
    }
}
