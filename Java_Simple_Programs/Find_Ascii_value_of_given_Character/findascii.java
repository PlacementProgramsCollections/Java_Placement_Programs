package Find_Ascii_value_of_given_Character;

/*
 * Java program to find the ascii value of the given character
 */
import java.util.Scanner;

public class findascii {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a character");
        char c=sc.nextLine().charAt(0);//Reads Single Character

        System.out.println("ASCII value of "+c+" is "+(int)c);
        sc.close();
    }
}
