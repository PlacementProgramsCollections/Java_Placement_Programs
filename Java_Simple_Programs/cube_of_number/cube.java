package cube_of_number;

/*
 * Java program to find the Cube of the given number
 */

import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n=sc.nextInt();

        System.out.println("Cube of number : "+n*n*n);
        System.out.println("Cube of number using Math.pow() : "+Math.pow(n, 3));

        sc.close();
    }
}
