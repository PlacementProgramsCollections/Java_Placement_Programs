package Java_Array_Imp_Problems.Remove_duplicates_from_array;

import java.util.ArrayList;

/*
 * Java program to remove the duplicates from the Array with the help of HashSet
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeduplicate {
    public static void UsingHashSet(){
        int[] a = {1,1,2,2,3,3,4,5,6,6};

        Set<Integer> set= new HashSet<Integer>();

        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }

        //below we are converting set to an Integer array using wrapper class
        Integer[] set1=set.toArray(new Integer[set.size()]);

        /* Alternative to above line no 19 */
        // int[] set1=new int[set.size()];
        // int i=0;
        // for(int b : set){
        //     set1[i]=b;
        //     i++;
        // }
        // System.out.println(Arrays.toString(set1));

        System.out.println(Arrays.toString(set1));
    }
    
    public static void WithoutUsingHashSet(){
        int[] a = {1,1,5,2,2,3,3,4,5,6,6};

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<a.length;i++){
            if(a[i]==-1){
                continue;
            }
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=-1;
                }
            }
            list.add(a[i]);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {   
        UsingHashSet();
        WithoutUsingHashSet();
    }
}
