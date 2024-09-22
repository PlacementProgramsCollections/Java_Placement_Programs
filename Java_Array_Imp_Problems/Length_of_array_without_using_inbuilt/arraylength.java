package Java_Array_Imp_Problems.Length_of_array_without_using_inbuilt;

/*
 * Java program to find the number of elements in the given array
 */

public class arraylength {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};

        System.out.println(a.length);

        //Without using inbuilt method
        int count=0;
        for(int i:a){
            count++;
        }
        System.out.println("Length of Array :"+count);
    }
}
