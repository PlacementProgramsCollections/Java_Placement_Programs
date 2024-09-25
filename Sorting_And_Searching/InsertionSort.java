package Sorting_And_Searching;

/*
Insertion Sort Algorithm :
Write a Java program that sorts an array of integers 
using the Insertion Sort method. The algorithm should 
build a sorted array one element at a time by taking the 
next element from the unsorted portion and inserting it into 
the correct position within the sorted portion of the array.
 */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] ={10, 5, 3, 8, 2};

        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]>a[j-1]){  // for sorting in descending add < operator here
                    break;
                }
                if(a[j]<a[j-1]){ // for sorting in descending add > operator here
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
