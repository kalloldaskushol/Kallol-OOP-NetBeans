import java.util.ArrayList;

class DataContainer<T extends Number> {
    ArrayList<T> list = new ArrayList<>();

	//Setter
    void addValue(T value) {
        list.add(value);
    }

	//Cal 
    double calculateAverage() {
        double sum = 0;
        for (T val : list) {
            sum += val.doubleValue();
        }
        return sum / list.size();
    }
}

public class Main2 {
    public static void main(String[] args) {
		
        DataContainer<Integer> marks = new DataContainer<>();
        marks.addValue(80);
        marks.addValue(90);

        DataContainer<Double> cgpa = new DataContainer<>();
        cgpa.addValue(3.5);
        cgpa.addValue(3.8);

        System.out.println("Marks Avg: " + marks.calculateAverage());
        System.out.println("CGPA Avg: " + cgpa.calculateAverage());
    }
}
