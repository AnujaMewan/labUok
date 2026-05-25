package Question03;

public class StudentMarkReportTest {
    public static void main(String[] args) {
        String[] marks = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marks);

       
        try {
            report.getMarkAt(6);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Selected mark position does not exist.");
        } finally {
            System.out.println("Array access checking completed.");
        }

       
        try {
            report.getMarkAt(2);
        } catch (NumberFormatException e) {
            System.out.println("Error: Selected mark is not a valid number.");
        } finally {
            System.out.println("Number conversion checking completed.");
        }
        
        System.out.println("Report checking completed.");
    }
}

// Comment1: because index 6 is outside the array bounds
// Comment2: because "absent" is not a valid integer 