package Java_IMP_Programs.Fibonacci_Upto_given_number;

import java.util.Scanner;

/*
Java program to print the Fibonacci series till the inputted number
 */

public class fib {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a limit : ");
        int n = sc.nextInt();

        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        int c=0;
        while(c<n){
            c=a+b;
            if(c>=n){
                break;
            }
            System.out.print(c+" ");
            a=b;
            b=c;
        }

        sc.close();
    }
}
