package Java_Array_Imp_Problems.Find_Missing_Element_in_Array;

/*
 * Java program to find the missing element in the array
 * Note : The elements given must be continuos and there is only one missing number
 */

public class missingelement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};

        int sum_without_missing=0;
        int sum_with_missing=0;

        //calculate sum without missing number
        for(int i=1;i<=6;i++){
            sum_without_missing+=i;
        }

        //calculate sum with missing number
        for(int i=0;i<a.length;i++){
            sum_with_missing+=a[i];
        }

        System.out.println("Missing number is "+(sum_without_missing-sum_with_missing));
    }
}
