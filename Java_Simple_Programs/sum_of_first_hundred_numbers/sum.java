package sum_of_first_hundred_numbers;

public class sum {
    public static void main(String[] args) {
        
        /* First Way using loop */
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum : "+sum);

        /* Second Way using Formula */
        int n=100;
        int sum1=(n*(n+1))/2;
        System.out.println("Sum : "+sum1);
        // This is efficient way to find sum of n numbers


    }
}
