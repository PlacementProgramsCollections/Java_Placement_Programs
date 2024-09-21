package Java_IMP_Programs.Print_System_Date_and_Time;

import java.util.Calendar;

public class date {
    public static void main(String[] args) {
        // Create an instance of Calendar
        Calendar calendar = Calendar.getInstance();

        // Get individual date and time components
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month is 0-based, so add 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Print date and time
        System.out.printf("Current date and time: %04d-%02d-%02d %02d:%02d:%02d\n", 
                          year, month, day, hour, minute, second);
    }
}
