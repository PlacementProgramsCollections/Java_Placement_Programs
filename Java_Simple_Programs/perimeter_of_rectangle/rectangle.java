package perimeter_of_rectangle;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Rectangle :");
        int l = sc.nextInt();

        System.out.println("Enter the bredth  of rectangle :");
        int b = sc.nextInt();

        double perimeter = 2*(l+b);

        System.out.println("Area of the Rectangle : "+perimeter);

        sc.close();
    }
}
