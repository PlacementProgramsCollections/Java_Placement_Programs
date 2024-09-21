package Java_Array_Imp_Problems.Printing_An_Array;

/*
 * Java program for printing the Array
 */

import java.util.Arrays;

public class printArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};

        // First Way to Print
        System.out.println("Array Elements : "+Arrays.toString(a));

        // Using Loops
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
    }
}
