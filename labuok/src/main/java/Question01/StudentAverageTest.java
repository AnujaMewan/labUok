package Question01;

public class StudentAverageTest {
    public static void main(String[] args) {
        StudentAverageCalculator calc = new StudentAverageCalculator(100, 0);

        try {
            calc.calculateAverage();
        } catch (Exception e) {
            System.out.println("Error: Number of students cannot be zero.");
        } finally {
            System.out.println("Average calculation completed.");
        }
        System.out.println("Program continues...");
    }
}