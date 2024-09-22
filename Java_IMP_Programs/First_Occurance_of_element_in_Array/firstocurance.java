package Java_IMP_Programs.First_Occurance_of_element_in_Array;
/*
 * Java program to find the first occurance of the given element
 * in the given array without using any algorithm
 */
public class firstocurance {
    public static void main(String[] args) {
        int[] a = {1,3,5,5,5,5,6,9};

        int n=5; //target number

        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                System.out.println("Element found at index : "+i);
                break;
            }
        }
    }
}
