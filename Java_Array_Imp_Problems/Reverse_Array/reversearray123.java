package Java_Array_Imp_Problems.Reverse_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Java program to reverse an Array manually and using Collections
 */

public class reversearray123 {
    public static void usingCollectionsreverse(){
        Integer[] a={1,2,3,4,5};

        List<Integer> list=Arrays.asList(a);

        Collections.reverse(list);;

        System.out.println(list);
    }
    public static void reversemanually(){
        int a[]={5, 4, 3, 2, 1};

        int j=a.length-1;
        for(int i=0;i<a.length;i++){
            if(i==j || i>j){
                break;
            }
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        usingCollectionsreverse();
        reversemanually();
    }
}
