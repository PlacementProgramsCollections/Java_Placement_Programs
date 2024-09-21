package swapping_two_numbers;

public class swap {
    public static void main(String[] args) {
        
        // Swap using temp
        int a = 10;
        int b= 20;

        int temp =a;
        a=b;
        b=temp;

        System.out.println("a="+a+" b="+b);

        // Swap without using temp
        int aa = 10;
        int bb= 20;

        aa=aa+bb;
        bb=aa-bb;
        aa=aa-bb;

        System.out.println("aa="+aa+" bb="+bb);

    }
}
