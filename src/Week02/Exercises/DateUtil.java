package Week02.Exercises;

public class DateUtil {

    enum Month{
        JANUARY(0, 31), FEBRUARY(1, 28),MARCH(2, 31),APRIL(4, 30),
        MAY(5, 31),JUNE(6, 30),JULY(7, 31),AUGUST(8, 31),
        SEPTEMBER(9, 30),OCTOBER(10, 31),NOVEMBER(11, 30);

        final int no;
        final int numberOfDay;

        private Month(int no, int numberOfDay) {
            this.no = no;
            this.numberOfDay = numberOfDay;
        }

        public int getNo() {
            return no;
        }

        public int getNumberOfDay() {
            return numberOfDay;
        }
    }

    // exercise 6
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        return year % 100 != 0 && year % 4 == 0;
    }

    // exercise 7
    public static boolean isValidDate(int day, int month, int year) {
        // Leap Year February
        if (month == 2 && isLeapYear(year) && (day >= 1 || day <= (Month.FEBRUARY.numberOfDay + 1)))
            return true;
        if (day < 1 || day > Month.values()[month-1].numberOfDay)
            return false;
        if (month < 1 || month > 12)
            return false;
        return year >= 1900 && year <= 2999;
    }

    // exercise 8
    public static int getDayOfYear(int day, int month, int year) {
        if (!isValidDate(day, month, year))
            return -1;

        int dayOfYear = day;
        switch (month-1) {
            case 11:
                dayOfYear += Month.NOVEMBER.numberOfDay;
            case 10:
                dayOfYear += Month.OCTOBER.numberOfDay;
            case 9:
                dayOfYear += Month.SEPTEMBER.numberOfDay;
            case 8:
                dayOfYear += Month.AUGUST.numberOfDay;
            case 7:
                dayOfYear += Month.JULY.numberOfDay;
            case 6:
                dayOfYear += Month.JUNE.numberOfDay;
            case 5:
                dayOfYear += Month.MAY.numberOfDay;
            case 4:
                dayOfYear += Month.APRIL.numberOfDay;
            case 3:
                dayOfYear += Month.MARCH.numberOfDay;
            case 2:
                dayOfYear += Month.FEBRUARY.numberOfDay;
                if (isLeapYear(year))
                    ++dayOfYear;
            case 1:
                dayOfYear += Month.JANUARY.numberOfDay;
        }
        return dayOfYear;
    }

    // exercise 9
    public static int getDayOfWeek(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            return -1;
        }
        int totalDay = getDayOfYear(day, month, year);
        totalDay += (year - 1900) * 365;
        totalDay += (year - 1900) / 4; // total leap years (year - 1900)
        return totalDay % 7;
    }

    public static String getDayName(int day, int month, int year) {
        switch(getDayOfWeek(day, month, year)) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "invalid date";
        }
    }
}
