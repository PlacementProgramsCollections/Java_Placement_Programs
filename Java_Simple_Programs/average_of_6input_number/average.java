package average_of_6input_number;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a=sc.nextInt();

        System.out.println("Enter second number :");
        int b=sc.nextInt();

        System.out.println("Enter third number :");
        int c=sc.nextInt();

        System.out.println("Enter fourth number :");
        int d=sc.nextInt();

        System.out.println("Enter fifth number :");
        int e=sc.nextInt();

        System.out.println("Enter sixth number :");
        int f=sc.nextInt();

        double avg = (a+b+c+d+e+f)/6;

        System.out.println("Average : "+avg);
        sc.close();
    }
}
