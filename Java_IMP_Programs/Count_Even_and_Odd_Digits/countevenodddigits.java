package Java_IMP_Programs.Count_Even_and_Odd_Digits;

import java.util.Scanner;

/*
 * Java program to count the number of even and odd digits in the given number
 */

public class countevenodddigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n=sc.nextInt();

        int counteven=0;
        int countodd=0;

        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                counteven++;
            }else{
                countodd++;
            }
            n=n/10;
        }

        System.out.println("No of Even digits :"+counteven);
        System.out.println("No of Odd digits :"+countodd);

        sc.close();
    }
}
