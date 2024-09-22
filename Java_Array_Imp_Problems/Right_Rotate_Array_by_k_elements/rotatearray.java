package Java_Array_Imp_Problems.Right_Rotate_Array_by_k_elements;

/*
Right Rotate Array by K Elements
Problem Statement:
Given an array of integers arr[] and an integer k, rotate the array to the right by k positions. Implement a function that efficiently rotates the array in place.

Input: arr[] = [1, 2, 3, 4, 5], k = 2
Output: [4, 5, 1, 2, 3]
 */

import java.util.Arrays;

public class rotatearray {
    public static void reversearray(int[] a,int size,int start){
        //Reverse the array
        int j=size;
        for(int i=start;i<a.length;i++){
            if(i==j || i>j){
                break;
            }
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        int k=1;

        //Reverse the array
        reversearray(a,a.length-1,0);

        //reverse first k elements
        reversearray(a,k-1,0);
        
        //reverse next k elements
        reversearray(a,a.length-1,k);

        System.out.println(Arrays.toString(a));
    }
}
