package Java_Array_Imp_Problems.Sort_Array_Using_Inbuilt_Method;

/*
 * Java program for sorting the elements in the Array using build-in functions
 */

import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int a[] = {3,6,1,7,2,8,5};
        
        Arrays.sort(a);

        System.out.println("Sorted Array : "+Arrays.toString(a));
    }
}
