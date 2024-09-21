/*  

Here’s the sequence of precedence for the given operators from highest to lowest:

1) () - Parentheses (highest precedence)
2) * - Multiplication
3) / - Division
4) % - Modulus
5) + - Addition
6) - - Subtraction (lowest precedence)
    
*/


package output_pgm_2;

public class output {
    public static void main(String[] args) {
        System.out.println((2+3)*4);

        
        System.out.println(9+6-3*4/2%5);
        // 3*4=12  =>   9+6-12/2%5
        // 12/2=6  =>   9+6-6%5
        // 6%5=1   => 9+6-1
        // 9+6=15  => 15-1
        // 15-1   => 14

        System.out.println(7+(3*5)*(4/2)+(5%3)-1);
     }
}

