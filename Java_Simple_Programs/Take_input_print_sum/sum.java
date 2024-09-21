package Take_input_print_sum;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a=sc.nextInt();

        System.out.println("Enter second number");
        int b=sc.nextInt();

        System.out.println("The sum of these number are : "+(a+b));

        sc.close();
    }
}
