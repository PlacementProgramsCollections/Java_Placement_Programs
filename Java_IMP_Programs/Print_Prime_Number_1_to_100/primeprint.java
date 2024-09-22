package Java_IMP_Programs.Print_Prime_Number_1_to_100;
/*
 * Java program to print all the prime numbers between 1 and 100
 */
public class primeprint {
    public static void main(String[] args) {
        // Note 1 is not a prime number
        for(int i=2;i<=100;i++){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
