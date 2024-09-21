package Java_Array_Imp_Problems.Find_Max_Min_In_Array;

/*
 * Java program to find the maximum and minimum in the given Array
 */

public class maxmin {
    public static void main(String[] args) {
        int[] a={45,58,46,32,5,92,7};

        int max=a[0];
        int min=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }

        System.out.println("Maximum : "+max);
        System.out.println("Maximum : "+min);
    }
}
