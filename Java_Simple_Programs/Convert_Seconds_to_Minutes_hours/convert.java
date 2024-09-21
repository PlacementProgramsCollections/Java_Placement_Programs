package Convert_Seconds_to_Minutes_hours;

/*
 * Java program which intakes number of seconds and converts into hours, minutes and seconds
 */
import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the seconds");
        int seconds=sc.nextInt();

        int minutes=seconds/60;
        int remainingseconds=seconds%60;
        int hours=minutes/60;
        int remainingminutes=minutes%60;

        System.out.println(hours+":"+remainingminutes+":"+remainingseconds);

        sc.close();
    }
}
