package Sorting_And_Searching;

/*

Linear Search Algorithm : 
Write a Java program that searches for a specific integer 
(target value) in an unsorted array using the linear search
 method. The program should iterate through the array to find
the target value. If the target is found, return the index 
of its first occurrence; otherwise, return -1

 */

public class LinearSearch {
    public static int linearsearch(int[] a,int targetVal){
        for(int i=0;i<a.length;i++){
            if(a[i]==targetVal){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3, 7, 2, 9, 5};

        int targetVal=7;

        int result=linearsearch(arr,targetVal);

        if(result==-1){
            System.out.println("Elemnet not found");
        }else{
            System.out.println(targetVal+" found at position "+result);
        }
    }
}
