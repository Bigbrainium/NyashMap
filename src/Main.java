import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> classGrades = new HashMap<String,Integer>();

        // Variables
        int numOfClasses;
        int low = 150;
        int high = -1;
        double sum = 0;
        double avg;

        // Adding classes
        classGrades.put("AP PRE CALC", 94);
        classGrades.put("APUSH", 95);
        classGrades.put("HONORS BIOLOGY", 97);
        classGrades.put("HONORS CHEMISTRY", 94);
        classGrades.put("HONORS ELA 2", 91);
        classGrades.put("SPANISH 1", 98);
        classGrades.put("CCP PROGRAMMING", 100);

        numOfClasses = classGrades.size();

        // Loops through every class, checks for highest and lowest grade
        for (String subject: classGrades.keySet()) {
            System.out.printf("\n%-20s %5d", subject, classGrades.get(subject));

            if (classGrades.get(subject) > high) {
                high = classGrades.get(subject);
            }

            if (classGrades.get(subject) < low) {
                low = classGrades.get(subject);
            }

            sum += classGrades.get(subject);
        }

        avg = sum/classGrades.size();

        System.out.println(" ");
        System.out.printf("\n%-20s %5d", "Number of Classes:", classGrades.size());
        System.out.printf("\n%-20s %5d", "Lowest Grade:", low);
        System.out.printf("\n%-20s %5d", "Highest Grade:", high);
        System.out.printf("\n%-20s %5f", "Average Grade:", avg);
    }
}