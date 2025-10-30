package Sorting_And_Searching;

/*
 * Cyclic Sort Algorithm :
 * Write a Java program that sorts an array containing n
 * integers ranging from 1 to n using the cyclic sort
 * algorithm. The program should rearrange the elements in
 * the array such that each integer is placed at its
 * correct index (i.e., the integer 1 at index 0, integer 2
 * at index 1, and so on).
 * The cyclic sort algorithm works by iterating through
 * the array and swapping elements to their correct
 * positions until all elements are in their correct places.
 */

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
