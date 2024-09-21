package Java_IMP_Programs.sum_of_digits_of_given_number;

import java.util.Scanner;

/*
Java program to find the sum of all the digits in the inputted number
 */

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digits = sc.nextInt();
        int sum=0;
        while(digits>0){
            int rem= digits%10;
            sum=sum+rem;
            digits=digits/10;
        }

        System.out.println("Sum of digits is "+sum);

        sc.close();
    }
}
