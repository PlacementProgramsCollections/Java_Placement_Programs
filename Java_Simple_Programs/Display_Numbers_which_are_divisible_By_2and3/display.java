package Display_Numbers_which_are_divisible_By_2and3;

/*
 * Java program to display the numbers from 1 to 25 which are divisible by both 2 and 3
 */

public class display {
    public static void main(String[] args) {
        for(int i=1;i<=25;i++){
            if(i%2==0 && i%3==0){
                System.out.println(i);
            }
        }
    }
}
