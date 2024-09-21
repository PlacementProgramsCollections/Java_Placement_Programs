package Java_Array_Imp_Problems.ReceiveInput_from_User_Save_In_Array;

import java.util.Arrays;
import java.util.Scanner;

public class recieveinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();

        int[] a=new int[size];

        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Array Elements are :"+Arrays.toString(a));

        sc.close();
    }
}
