package Java_Array_Imp_Problems.Compare_two_Arrays;

/*
 * Java program to compare two arrays using Arrays.equals(args,args) and without using it
 */

import java.util.Arrays;

public class comparearray {
    public static void compareusinginbuilt(){
        int[] a={1,2,3,4,5};
        int[] b={1,2,4,3,5};

        if(Arrays.equals(a, b)){
            System.out.println("Both Arrays Contains same value at same position");
        }else{
            System.out.println("Array elements in arrays is not equal");
        }
    }
    public static void WithoutUsingInbuilt(){
        int[] a={1,2,3,4,5,8};
        int[] b={1,2,3,4,5};

        boolean isTrue=true;
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    isTrue=false;
                    break;
                }
            }
        }else{
            isTrue=false;
        }
        
        if(isTrue){
            System.out.println("They are equal");

        }else{
            System.out.println("they are not equal");
        }
    }
    public static void main(String[] args) {
        compareusinginbuilt();
        WithoutUsingInbuilt();
    }
}
