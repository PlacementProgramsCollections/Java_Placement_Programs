package sum_of_even_number;

public class sum {
    public static void main(String[] args) {
        int sum=0;

        for(int i=1;i<=10;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }

        System.out.println("Sum of Even numbers 1 to 10 : "+sum);
    }
}
