package perimeter_of_circle;

import java.util.Scanner;

// Note : It is also called Circumference
public interface perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius : ");
        double r = sc.nextFloat();

        double pi = Math.PI;
        
        double circumference = 2*pi*r;

        System.out.println("Circumference of a circle : "+circumference);

        sc.close();
    }
}
