package Java_IMP_Programs.Find_Factors_of_a_Number;


/*
 * Java program to find the factors of the number and the count number of factors
 */
public class factors {
    public static void main(String[] args) {
        int n=8;
        int countfactor=0;

        System.out.println("Factors of given number are :");
        for(int i=1;i<=67;i++){
            if(n%i==0){
                System.out.println(i);
                countfactor++;
            }
        }
        System.out.println("Total number of factors is :"+countfactor);
    }
}
