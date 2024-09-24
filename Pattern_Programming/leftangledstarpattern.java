package Pattern_Programming;

/* Print below pattern

         *
       * *
     * * *
   * * * *
 * * * * *
 
 */

public class leftangledstarpattern {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
