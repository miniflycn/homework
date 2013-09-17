/**
 * Checking for leap years.
 *
 * @author Daniel Yang
 */
public class YearCheck {

    /** For each year in ARGS, indicate its leap status. */
    public static void main(String... args) {
        for (String arg : args) {
            int year = Integer.parseInt(arg);
            if (isLeapYear(year)) {
                System.out.printf("%d is a leap year.%n", year);
            } else {
                System.out.printf("%d is not a leap year.%n", year);
            }
        }
    }

    /** Returns true iff YEAR is a leap year. */
    static boolean isLeapYear(int year) {
        if (year % 100 != 0 && year % 4 == 0) return true;
        if (year % 400 == 0) return true; 
        return false;
    }
}
