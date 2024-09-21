package Java_IMP_Programs.Factorial_of_Number;

/*
 * Java program to find the factorial of the given number
 */

public class factorial {
    public static void simpleway(){
        int n=4,fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;
        }

        System.out.println("Factorial of "+n+" is "+fact);
    }
    public static int usingrecurrsion(int n){
        if(n==1){
            return 1;
        }else{
            return n*usingrecurrsion(n-1);
        }
    }
    public static void main(String[] args) {
        //Without Recursion
        simpleway();
        
        // with recurrsion
        int n=3;
        int result=usingrecurrsion(n);
        System.out.println("Factorial of "+n+" is "+result);
    }
}
