package Java_Array_Imp_Problems.Sum_of_elements_in_Array;

/*
 * Java program to find the sum of all the elements in the Array
 */

public class sumofarrayelements {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }

        System.out.println("Sum of Array elements "+sum);
    }
}
