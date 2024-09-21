package Java_IMP_Programs.Find_Remainder_without_modulus_operator;
/*
 * Java program that calculates the reminder of two numbers without using modulus operator
 */
public class remainder {
    public static void main(String[] args) {
        
        int a=10;
        int b=3;

        int div=a/b;
        int remainder=a-(div*b);

        System.out.println(remainder);
    }
}
