package square_of_number;

/*
 * Java Program to find the Square of the given number
 */

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n=sc.nextInt();

        System.out.println("Square of number : "+n*n);
        System.out.println("Square of number using Math.pow() : "+Math.pow(n, 2));

        sc.close();
    }
}
