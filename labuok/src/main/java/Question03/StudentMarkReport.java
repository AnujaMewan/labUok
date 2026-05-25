package Question03;

public class StudentMarkReport {
    private String[] marks;

    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    public int getMarkAt(int index) {
        return Integer.parseInt(marks[index]);
    }
}
