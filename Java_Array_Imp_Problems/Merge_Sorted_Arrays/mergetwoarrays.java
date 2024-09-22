package Java_Array_Imp_Problems.Merge_Sorted_Arrays;

/*
 * Java program to merge two different sorted arrays into a third sorted array
 */

import java.util.Arrays;

public class mergetwoarrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,7,9};
              
        int[] b = {2,4,6,8,10,12,14,16};

        int[] c=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }

        int j=0;
        for(int i=a.length;i<c.length;i++){
            c[i]=b[j];
            j++;
        }

        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }
}
