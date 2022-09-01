package Week03.Exercises.School;

public class Lecture {
    
    private String name;
    private int midterm;
    private int finalExam;

    public Lecture(String name, String midterm, String finalExam) {
        this.name = name;
        this.midterm = Integer.parseInt(midterm);
        this.finalExam = Integer.parseInt(finalExam);
    }

    private double calculateAverage() {
        return 0.4 * midterm + 0.6 * finalExam;

    }

    @Override
    public String toString() {
        return name + ": " + calculateAverage();
    }
}
