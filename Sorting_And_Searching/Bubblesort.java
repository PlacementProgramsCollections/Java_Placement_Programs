package Sorting_And_Searching;

/*
    Optimized Bubble Sort Algorithm :
    You are tasked with implementing an optimized version 
    of the Bubble Sort algorithm to sort an array of integers 
    in ascending order. This version should terminate early if 
    no elements are swapped during a pass, indicating that the
    array is already sorted.
 */

import java.util.Arrays;

public class Bubblesort {
    public static void bubblesort(int[] a){ 
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){   // to sort in descending just add < operator
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    } 
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};

        bubblesort(a);

        System.out.println(Arrays.toString(a));

    }
}
