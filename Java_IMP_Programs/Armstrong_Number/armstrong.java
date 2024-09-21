package Java_IMP_Programs.Armstrong_Number;

/*
 * Java program to find whether the given number is an Armstrong number
 */

/*
 * An Armstrong number (also known as a narcissistic number 
 * or pluperfect digital invariant) is a number that is 
 * equal to the sum of its digits each raised to the power 
 * of the number of digits.
 */

public class armstrong {
    public static void main(String[] args) {
        int n=153;
        int copy=n;
        
        int len=Integer.toString(n).length();

        //Efficient way to find length
        //int len = (int) Math.log10(n) + 1; // Find the number of digits using logarithm

        double sum=0,rem;
        while (n>0){
            rem=n%10;
            sum=sum+Math.pow(rem, len);
            n=n/10;
        }

        if(sum==copy){
            System.out.println("It is Armstrong number");
        }else{
            System.out.println("It is not Armstrong number");
        }
    }
}
