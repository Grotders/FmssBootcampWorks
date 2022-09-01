package Week03.Exercises.School;
import Week02.Exercises.DateUtil;

public class Student {
    private String fullName;
    private String birthday;

    Lecture lec;
// Oğuz karan:10/09/1976:Matematik:90:100

    public Student(String record) {
        String [] recordArray = record.split(":", 7);
        fullName = recordArray[0];
        birthday = recordArray[1];
        lec = new Lecture(recordArray[2], recordArray[3], recordArray[4]);

    }

    private String getDayOfWeek() {
        String [] date = birthday.split("/", 3);
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);
        return DateUtil.getDayName(day, month, year);
    }

    @Override
    public String toString() {
        return fullName + "\n\tbirth on " + getDayOfWeek() + " \n\t" + lec;
    }
}
