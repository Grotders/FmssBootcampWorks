package Week02.Exercises;

public class DateUtil {
    private static final int JANUARY = 31;
    private static final int FEBRUARY = 28;
    private static final int MARCH = 31;
    private static final int APRIL = 30;
    private static final int MAY = 31;
    private static final int JUNE = 30;
    private static final int JULY = 31;
    private static final int AUGUST = 31;
    private static final int SEPTEMBER = 30;
    private static final int OCTOBER = 31;
    private static final int NOVEMBER = 30;

    // exercise 6
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        return year % 100 != 0 && year % 4 == 0;
    }

    // exercise 7
    public static boolean isValidDate(int day, int month, int year) {
        if (day < 1 || day > 31)
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
                dayOfYear += NOVEMBER;
            case 10:
                dayOfYear += OCTOBER;
            case 9:
                dayOfYear += SEPTEMBER;
            case 8:
                dayOfYear += AUGUST;
            case 7:
                dayOfYear += JULY;
            case 6:
                dayOfYear += JUNE;
            case 5:
                dayOfYear += MAY;
            case 4:
                dayOfYear += APRIL;
            case 3:
                dayOfYear += MARCH;
            case 2:
                dayOfYear += FEBRUARY;
                if (isLeapYear(year))
                    ++dayOfYear;
            case 1:
                dayOfYear += JANUARY;
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
}
