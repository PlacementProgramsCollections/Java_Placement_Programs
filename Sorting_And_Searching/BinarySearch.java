package Sorting_And_Searching;

/*

Binary Search Algorithm :
Write a Java program that searches for a specific integer
(target value) in a sorted array using the binary search 
method. The program should repeatedly divide the search 
space in half until the target is found or the search 
space is exhausted.

 */

public class BinarySearch {
    public static int binarysearch(int[] arr,int targetVal){
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==targetVal){
                return mid;
            }

            if(targetVal>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,24,45,65,87,95};

        int targetVal=9;

        int result=binarysearch(a,targetVal);

        if(result==-1){
            System.out.println("Elemnet not found");
        }else{
            System.out.println(targetVal+" found at position "+result);
        }
    }
}
