package Sorting_And_Searching;

/*
Selection Sort Algorithm :
Write a Java program that sorts an array of integers using the 
Selection Sort method. The algorithm works by repeatedly 
selecting the minimum (or maximum) element from the unsorted 
portion of the array and moving it to the beginning (or end) 
of the sorted portion.
 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] ={34,23,12,56,24,56};
        int n=a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){ // to sort in descending just add > operator
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

        System.out.println(Arrays.toString(a));
    }
}
