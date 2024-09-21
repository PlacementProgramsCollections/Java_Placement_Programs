package Java_IMP_Programs.GCD_OR_HCF_LCM_Program;

/*
 * Java program to find the greatest common divisor of given numbers (LCM Also)
 */

import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int m=sc.nextInt();
        int a=m;

        System.out.println("Enter another number :");
        int n=sc.nextInt();
        int b=n;

        while(m!=n){
            if(m>n){
                m=m-n;
            }else{
                n=n-m;
            }
        }
        // m now holds the GCD (HCF)
        int gcd = m;
        System.out.println("GCD : "+gcd);

        // a*b=HCF*LCM;

        int lcm=(a*b)/m;
        System.out.println("LCM : "+lcm);

        sc.close();
    }
}
