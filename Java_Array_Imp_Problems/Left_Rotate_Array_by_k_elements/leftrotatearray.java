package Java_Array_Imp_Problems.Left_Rotate_Array_by_k_elements;

/*
Left Rotate Array by K Elements
Problem Statement:
Given an array of integers arr[] and an integer k, rotate the array to the left by k positions. Implement a function that efficiently rotates the array in place.

Input: arr[] = [1, 2, 3, 4, 5], k = 2
Output: [3, 4, 5, 1, 2]
 */

import java.util.Arrays;

public class leftrotatearray {
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

        int k=2;

        if(k>=a.length){
            System.out.println("Invalid k");
            System.exit(0);
        }

        //Reverse the array
        reversearray(a,a.length-1,0);

        reversearray(a, a.length-k-1, 0);

        reversearray(a, a.length-1, a.length-k);

        System.out.println(Arrays.toString(a));
    }
}
