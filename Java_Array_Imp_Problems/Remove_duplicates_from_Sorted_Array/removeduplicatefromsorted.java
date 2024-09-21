package Java_Array_Imp_Problems.Remove_duplicates_from_Sorted_Array;

/*
 * Java program to delete duplicates from Sorted Array
 */

import java.util.ArrayList;

public class removeduplicatefromsorted {
    public static void main(String[] args) {
        //{3,4,4,5,5,5,6,7,9,9};

        int[] a={3,4,4,5,5,5,6,7,9,9};
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<a.length;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            list.add(a[i]);
        }

        System.out.println(list);
    }
}
