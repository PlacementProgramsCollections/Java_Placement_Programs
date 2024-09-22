package Java_IMP_Programs.Check_Prime_Number;
/*
 * Java program to check whether the given number is a prime number
 */
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n=sc.nextInt();

        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println("It is a prime number ");
        }else{
            System.out.println("It is not a prime number");
        }

        sc.close();
    }
}
