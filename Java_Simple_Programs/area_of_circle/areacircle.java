package area_of_circle;

import java.util.Scanner;

public class areacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pi = 22/7;

        System.out.println("Enter radius of circle :");
        float r = sc.nextFloat();

        float area = pi*r*r;

        System.out.println("Area of the circle is :"+area);

        sc.close();
    }
}
