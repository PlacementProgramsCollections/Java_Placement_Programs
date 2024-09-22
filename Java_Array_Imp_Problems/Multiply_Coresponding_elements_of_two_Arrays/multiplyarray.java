package Java_Array_Imp_Problems.Multiply_Coresponding_elements_of_two_Arrays;

/*
 * Java Program to Multiple corresponding elements of two Arrays
 */

public class multiplyarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};

        System.out.println("Multiplied Array : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]*b[i]+ " ");
        }
    }
}
