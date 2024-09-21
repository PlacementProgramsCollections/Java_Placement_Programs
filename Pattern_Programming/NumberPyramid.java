package Pattern_Programming;

/* Print Following Pattern

     0
    0  1
   0  1  2
  0  1  2  3
 0  1 2  3  4

 */

public class NumberPyramid {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
