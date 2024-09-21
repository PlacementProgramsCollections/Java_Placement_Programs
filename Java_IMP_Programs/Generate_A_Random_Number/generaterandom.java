package Java_IMP_Programs.Generate_A_Random_Number;

/*
 * Java program to generate a random number within the given range
 */

public class generaterandom {
    public static void main(String[] args) {
        
        double random=Math.random();

        int range=15;//Set the Range

        System.out.println("Random number : "+(int)(random*range));
        //Converted the double to int
    }
}
