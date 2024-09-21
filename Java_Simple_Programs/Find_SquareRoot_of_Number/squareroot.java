package Find_SquareRoot_of_Number;

/*
 * Java program to find the square root of the given number
 */

import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n=sc.nextInt();

        System.out.println("Square Root of "+n+" is "+Math.sqrt(n));

        sc.close();
    }
}
