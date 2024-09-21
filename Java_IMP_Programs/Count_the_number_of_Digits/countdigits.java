package Java_IMP_Programs.Count_the_number_of_Digits;

/*
 * Java program to count the number of digits in the given number
 */

public class countdigits {
    public static int Countdigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int countusingMathLog(int n){
        return (int)Math.log10(n)+1;
    }
    public static int countusingStringLength(int n){
        String str=Integer.toString(n);
        return (int)(str.length());
    }
    public static void main(String[] args) {
        int n=125;

        //Normal way
        int result=Countdigits(n);

        //USing MAth Logarithms
        int result1=countusingMathLog(n);

        //Using String Length
        int result2=countusingStringLength(n);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
